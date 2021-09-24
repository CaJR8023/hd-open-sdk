package com.fkw.hdopen.operation.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fkw.hdopen.Operation;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.comm.HttpRequestUtils;
import com.fkw.hdopen.comm.ResourceUris;
import com.fkw.hdopen.model.Result;
import com.fkw.hdopen.operation.IOpenToolOperation;
import okhttp3.Request;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * 互动开放工具操作接口实现类
 *
 * @author CAJR
 * @version 1.0.0
 */
public class OpenToolOperation extends Operation implements IOpenToolOperation {

    public OpenToolOperation(URI endpoint, ServiceClient client, CredentialsProvider credentialsProvider) {
        super(endpoint, client, credentialsProvider);
    }

    @Override
    public Result<String> transformLongUrl(String key) {
        String uri = endpoint + ResourceUris.CHANGE_TO_LONG_URL.getUri();
        String method = ResourceUris.CHANGE_TO_LONG_URL.getMethod();
        Map<String, String> params = new HashMap<>(2);
        params.put("key", key);
        Request request = HttpRequestUtils.buildRequest(uri, method, params);
        return doOperation(request, new TypeReference<Result<String>>() {
        });
    }

    @Override
    public Result<String> transformShortUrl(String url) {
        String uri = endpoint + ResourceUris.CHANGE_TO_SHORT_URL.getUri();
        String method = ResourceUris.CHANGE_TO_SHORT_URL.getMethod();
        Map<String, String> params = new HashMap<>(2);
        params.put("url", url);
        Request request = HttpRequestUtils.buildRequest(uri, method, params);
        return doOperation(request, new TypeReference<Result<String>>() {
        });
    }
}
