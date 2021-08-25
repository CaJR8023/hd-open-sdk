package com.fkw.hdopen.model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fkw.hdopen.Operation;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.comm.ResourceUri;
import okhttp3.Request;

/**
 * @author CAJR
 * @Description test
 * @date 2021/7/27 15:06
 */
public class TestOperation extends Operation {
    public TestOperation(ServiceClient client, CredentialsProvider credentialsProvider) {
        super(client, credentialsProvider);
    }

    public String test() {
        String uri = endpoint + "/";
        Request request = new Request.Builder().url(uri).build();
        return doOperation(request, new TypeReference<String>() {});
    }

    public Result<String> test1() {
        String uri = endpoint + ResourceUri.TEST_URI.getUri();
        Request request = new Request.Builder().url(uri).build();
        return doOperation(request, new TypeReference<Result<String>>() {});
    }
}
