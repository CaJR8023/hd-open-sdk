package com.fkw.hdopen.operation.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fkw.hdopen.Operation;
import com.fkw.hdopen.comm.ResourceUris;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.comm.HttpRequestUtils;
import com.fkw.hdopen.model.*;
import com.fkw.hdopen.model.request.CallHdOpenConsumeCodeApiVO;
import com.fkw.hdopen.model.request.CallHdOpenConsumeRecordPageApiVO;
import com.fkw.hdopen.operation.IHdOpenConsumeRecordOperation;
import okhttp3.Request;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * @author faisco
 * @Description 互动核销记录开放业务接口
 * @date 2021/9/9 13:44
 */
public class HdOpenConsumeRecordOperation extends Operation implements IHdOpenConsumeRecordOperation {

    public HdOpenConsumeRecordOperation(URI endpoint, ServiceClient client, CredentialsProvider credentialsProvider) {
        super(endpoint, client, credentialsProvider);
    }

    @Override
    public PageResult<HdConsumeRecordVO> getConsumeRecordByPage(CallHdOpenConsumeRecordPageApiVO vo) {
        String uri = endpoint + ResourceUris.GET_CONSUME_RECORD_BY_PAGE.getUri();
        String method = ResourceUris.GET_CONSUME_RECORD_BY_PAGE.getMethod();
        Request request = HttpRequestUtils.buildRequest(uri, method, vo);
        return doOperation(request, new TypeReference<PageResult<HdConsumeRecordVO>>() {
        });
    }

    @Override
    public Result<HdCodeStatusVO> getCodeStatus(int aid, String code) {
        String uri = endpoint + ResourceUris.GET_ONE_ACTIVITY_USER_BY_FAI_OPENID.getUri();
        String method = ResourceUris.GET_ONE_ACTIVITY_USER_BY_FAI_OPENID.getMethod();
        Map<String, String> params = new HashMap<>(8);
        params.put("aid", String.valueOf(aid));
        params.put("code", code);
        Request request = HttpRequestUtils.buildRequest(uri, method, params);
        return doOperation(request, new TypeReference<Result<HdCodeStatusVO>>() {
        });
    }

    @Override
    public Result<Integer> consumeCode(CallHdOpenConsumeCodeApiVO vo) {
        String uri = endpoint + ResourceUris.CONSUME_CODE.getUri();
        String method = ResourceUris.CONSUME_CODE.getMethod();
        Request request = HttpRequestUtils.buildRequest(uri, method, vo);
        return doOperation(request, new TypeReference<Result<Integer>>() {
        });
    }

    @Override
    public Result<HdRedPacketVO> getRedPacketRecord(Integer aid, Integer activityId, String cmCode) {
        String uri = endpoint + ResourceUris.GET_RED_PACKET_RECORD.getUri();
        String method = ResourceUris.GET_RED_PACKET_RECORD.getMethod();
        Map<String, String> params = new HashMap<>(8);
        params.put("aid", String.valueOf(aid));
        params.put("activityId", String.valueOf(activityId));
        params.put("cmCode", cmCode);
        Request request = HttpRequestUtils.buildRequest(uri, method, params);
        return doOperation(request, new TypeReference<Result<HdRedPacketVO>>() {
        });
    }
}
