package com.fkw.hdopen.operation.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fkw.hdopen.Operation;
import com.fkw.hdopen.ResourceUris;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.comm.HttpRequestUtils;
import com.fkw.hdopen.model.HdAccountLoginVO;
import com.fkw.hdopen.model.HdAccountRegisterVO;
import com.fkw.hdopen.model.Result;
import com.fkw.hdopen.model.request.CallHdOpenLoginApiVO;
import com.fkw.hdopen.operation.IHdOpenAccountOperation;
import okhttp3.Request;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CAJR
 * @Description 互动开放账号操作接口类
 * @date 2021/9/13 9:43
 */
public class HdOpenAccountOperation extends Operation implements IHdOpenAccountOperation {
    public HdOpenAccountOperation(URI endpoint, ServiceClient client, CredentialsProvider credentialsProvider) {
        super(endpoint, client, credentialsProvider);
    }


    @Override
    public Result<HdAccountRegisterVO> register(String partnerId) {
        String uri = endpoint + ResourceUris.HD_OPEN_REGISTER.getUri();
        String method = ResourceUris.HD_OPEN_REGISTER.getMethod();
        Map<String, String> params = new HashMap<>(2);
        params.put("partnerId", partnerId);
        Request request = HttpRequestUtils.buildRequest(uri, method, params);
        return doOperation(request, new TypeReference<Result<HdAccountRegisterVO>>() {
        });
    }

    @Override
    public Result<HdAccountRegisterVO> registerOemAcct(String partnerId, Integer agentAid) {
        String uri = endpoint + ResourceUris.HD_OPEN_REGISTER.getUri();
        String method = ResourceUris.HD_OPEN_REGISTER.getMethod();
        Map<String, String> params = new HashMap<>(2);
        params.put("partnerId", partnerId);
        params.put("agentAid", String.valueOf(agentAid));
        Request request = HttpRequestUtils.buildRequest(uri, method, params);
        return doOperation(request, new TypeReference<Result<HdAccountRegisterVO>>() {
        });
    }

    @Override
    public Result<HdAccountLoginVO> login(CallHdOpenLoginApiVO vo) {
        String uri = endpoint + ResourceUris.HD_OPEN_LOGIN.getUri();
        String method = ResourceUris.HD_OPEN_LOGIN.getMethod();
        Request request = HttpRequestUtils.buildRequest(uri, method, vo);
        return doOperation(request, new TypeReference<Result<HdAccountLoginVO>>() {
        });
    }
}
