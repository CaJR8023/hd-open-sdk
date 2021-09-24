package com.fkw.hdopen.client;


import com.fkw.hdopen.ClientConfiguration;
import com.fkw.hdopen.comm.ExecutionContext;
import com.fkw.hdopen.comm.Header;
import okhttp3.*;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;

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
        return this.okHttpClient.newCall(request).execute();
    }

    public OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }
}
