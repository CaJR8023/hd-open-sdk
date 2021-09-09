package com.fkw.hdopen;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.comm.ExecutionContext;
import com.fkw.hdopen.comm.HttpStatus;
import com.fkw.hdopen.comm.JsonUtils;
import com.fkw.hdopen.exception.HttpClientErrorException;
import com.fkw.hdopen.exception.HttpServerErrorException;
import com.fkw.hdopen.exception.OperationException;
import com.fkw.hdopen.exception.UnknownHttpStatusCodeException;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Objects;

/**
 * @author CAJR
 * @Description 具体操作
 * @date 2021/7/26 14:11
 */
public abstract class Operation {
    protected volatile URI endpoint;
    protected ServiceClient client;
    protected CredentialsProvider credentialsProvider;

    public Operation(URI endpoint, ServiceClient client, CredentialsProvider credentialsProvider) {
        this.client = client;
        this.credentialsProvider = credentialsProvider;
        this.setEndpoint(endpoint);
    }

    /**
     * 主操作方法
     *
     * @param request 请求
     * @param type    返回泛型
     * @return T 泛型
     * @author CAJR
     * @date 2021/7/27
     */
    protected <T> T doOperation(Request request, TypeReference<T> type) {
        ExecutionContext context = createDefaultContext();
        Response response = send(context, request);
        try {
            checkIsSuccess(response);
            return JsonUtils.nativeRead(Objects.requireNonNull(response.body()).string(), type);
        } catch (IOException e) {
            throw new OperationException("Operation error", e);
        }
    }

    protected Response send(ExecutionContext context, Request request) {
        Response response;
        try {
            response = this.client.sendRequest(request, context);
        } catch (Exception e) {
            throw new OperationException("Client send fail, Caused by: " + e.getMessage());
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

    protected ExecutionContext createDefaultContext() {
        return new ExecutionContext(credentialsProvider.getCredentials());
    }

    public URI getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(URI endpoint) {
        this.endpoint = URI.create(endpoint.toString());
    }
}
