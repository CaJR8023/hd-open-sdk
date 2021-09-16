package com.fkw.hdopen.operation.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fkw.hdopen.Operation;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.comm.HttpRequestUtils;
import com.fkw.hdopen.comm.ResourceUris;
import com.fkw.hdopen.model.Result;
import com.fkw.hdopen.operation.IOpenSecurityOperation;
import okhttp3.Request;

import java.net.URI;
import java.util.HashMap;

/**
 * @author CAJR
 * @Description 开放安全操作接口实现类
 * @date 2021/9/16 10:44
 */
public class OpenSecurityOperation extends Operation implements IOpenSecurityOperation {
    public OpenSecurityOperation(URI endpoint, ServiceClient client, CredentialsProvider credentialsProvider) {
        super(endpoint, client, credentialsProvider);
    }

    @Override
    public Result<String> getPublicKey() {
        String uri = endpoint + ResourceUris.GET_PUBLIC_KEY.getUri();
        String method = ResourceUris.GET_PUBLIC_KEY.getMethod();
        Request request = HttpRequestUtils.buildRequest(uri, method, new HashMap<>(2));
        return doOperation(request, new TypeReference<Result<String>>() {
        });
    }
}
