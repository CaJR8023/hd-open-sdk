package com.fkw.hdopen;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.comm.ExecutionContext;
import com.fkw.hdopen.comm.JsonUtils;
import com.fkw.hdopen.exception.OperationException;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.URI;
import java.util.Objects;

/**
 * 具体操作
 *
 * @author CAJR
 * @version 1.0.0
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
     */
    protected <T> T doOperation(Request request, TypeReference<T> type) {
        ExecutionContext context = createDefaultContext();
        Response response = send(context, request);
        try {
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
