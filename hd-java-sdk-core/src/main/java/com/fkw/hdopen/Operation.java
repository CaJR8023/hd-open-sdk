package com.fkw.hdopen;

import com.google.gson.Gson;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.comm.ExecutionContext;
import com.fkw.hdopen.exception.OperationException;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
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

    public Operation(ServiceClient client, CredentialsProvider credentialsProvider) {
        this.client = client;
        this.credentialsProvider = credentialsProvider;
    }

    /**
     *  主操作方法
     * @param request 请求
     * @param tClass 返回泛型
     * @return T 泛型
     * @author CAJR
     * @date 2021/7/27
     */
    protected <T> T doOperation(Request request, Class<T> tClass) {
        ExecutionContext context = createDefaultContext();
        Response response = send(context, request);
        try {
            return new Gson().fromJson(Objects.requireNonNull(response.body()).string(), tClass);
        } catch (IOException e) {
            throw new OperationException("Operation format Json error");
        }
    }

    protected Response send(ExecutionContext context, Request request) {
        Response response;
        try {
            response = this.client.sendRequest(request, context);
        } catch (IOException e) {
            throw new OperationException("Client send fail");
        }
        return response;
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
