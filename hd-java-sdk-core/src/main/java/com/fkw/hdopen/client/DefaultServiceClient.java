package com.fkw.hdopen.client;


import com.fkw.hdopen.ClientConfiguration;
import com.fkw.hdopen.comm.ExecutionContext;
import com.fkw.hdopen.comm.Header;
import com.fkw.hdopen.comm.HttpStatus;
import com.fkw.hdopen.exception.HttpClientErrorException;
import com.fkw.hdopen.exception.HttpServerErrorException;
import com.fkw.hdopen.exception.UnknownHttpStatusCodeException;
import okhttp3.*;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.util.Objects;

/**
 * 业务客户端
 *
 * @author CAJR
 * @version 1.0.0
 */
public class DefaultServiceClient extends ServiceClient {
    protected OkHttpClient okHttpClient;

    public DefaultServiceClient(ClientConfiguration config) {
        super(config);
        this.okHttpClient = new OkHttpClient.Builder().retryOnConnectionFailure(config.isRetryOnConnectionFailure())
                .connectTimeout(config.getConnectionTimeout(), config.getTimeUnit())
                .readTimeout(config.getReadTimeout(), config.getTimeUnit())
                .writeTimeout(config.getWriteTimeout(), config.getTimeUnit())
                .connectionPool(new ConnectionPool(config.getMaxConnections(), config.getIdleConnectionTime(), config.getTimeUnit()))
                .build();
        String proxyHost = config.getProxyHost();
        int proxyPort = config.getProxyPort();
        if (proxyHost != null && proxyPort > 0) {
            Type type = Type.HTTP;
            SocketAddress socketAddress = new InetSocketAddress(proxyHost, proxyPort);
            Proxy proxy = new Proxy(type, socketAddress);
            this.okHttpClient = this.okHttpClient.newBuilder().proxy(proxy).build();
        }
    }

    @Override
    public Response sendRequest(Request request, ExecutionContext context) throws IOException {
        context.init(configuration, okHttpClient);
        request = request.newBuilder()
                .headers(Headers.of(Header.AUTHORIZATION.toString(), Header.BEARER.toString() + " " + context.getAccessToken()))
                .build();
        Response response = this.okHttpClient.newCall(request).execute();
        try {
            checkIsSuccess(response);
        } catch (HttpClientErrorException clientErrorException) {
            //如果返回401,清空下token缓存,并初始化下token
            if (clientErrorException.getStatusCode().value() == HttpStatus.UNAUTHORIZED.value()) {
                context.clearTokenContext();
                context.init(configuration, okHttpClient);
            }
            throw clientErrorException;
        }
        return response;
    }

    protected void checkIsSuccess(Response response) throws IOException {
        if (response.isSuccessful()) {
            return;
        }
        int code = response.code();
        if (HttpStatus.valueOf(code).is4xxClientError()) {
            throw new HttpClientErrorException(HttpStatus.valueOf(code), "client error",
                    Objects.requireNonNull(response.body()).bytes(),
                    Objects.requireNonNull(Objects.requireNonNull(response.body()).contentType()).charset());
        } else if (HttpStatus.valueOf(code).is5xxServerError()) {
            throw new HttpServerErrorException(HttpStatus.valueOf(code), "server error",
                    Objects.requireNonNull(response.body()).bytes(),
                    Objects.requireNonNull(Objects.requireNonNull(response.body()).contentType()).charset());
        } else if (!HttpStatus.valueOf(code).is1xxInformational() && !HttpStatus.valueOf(code).is3xxRedirection()) {
            throw new UnknownHttpStatusCodeException(code, "unknown status code error", response.headers(),
                    Objects.requireNonNull(response.body()).bytes(),
                    Objects.requireNonNull(Objects.requireNonNull(response.body()).contentType()).charset());
        }
    }

    public OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }
}
