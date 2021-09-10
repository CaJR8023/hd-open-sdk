package com.fkw.hdopen.operation.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fkw.hdopen.Operation;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.comm.HttpRequestUtils;
import com.fkw.hdopen.comm.ResourceUris;
import com.fkw.hdopen.model.HdActivitySpreadStatLevelVO;
import com.fkw.hdopen.model.HdActivityUserSpreadStatVO;
import com.fkw.hdopen.model.Result;
import com.fkw.hdopen.operation.IHdOpenActivitySpreadStatOperation;
import okhttp3.Request;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author faisco
 * @Description 互动活动传播数据开放业务接口
 * @date 2021/9/9 13:40
 */
public class HdOpenActivitySpreadStatOperation extends Operation implements IHdOpenActivitySpreadStatOperation {

    public HdOpenActivitySpreadStatOperation(URI endpoint, ServiceClient client, CredentialsProvider credentialsProvider) {
        super(endpoint, client, credentialsProvider);
    }

    @Override
    public Result<List<HdActivitySpreadStatLevelVO>> getActivitySpreadStatLevel(int aid, int activityId) {
        String uri = endpoint + ResourceUris.GET_ACTIVITY_SPREAD_STAT_LEVEL_URI.getUri();
        String method = ResourceUris.GET_ACTIVITY_SPREAD_STAT_LEVEL_URI.getMethod();
        Map<String, String> params = new HashMap<>(8);
        params.put("aid", String.valueOf(aid));
        params.put("activityId", String.valueOf(activityId));
        Request request = HttpRequestUtils.buildRequest(uri, method, params);
        return doOperation(request, new TypeReference<Result<List<HdActivitySpreadStatLevelVO>>>() {
        });
    }

    @Override
    public Result<HdActivityUserSpreadStatVO> getActivityUserSpreadStat(int aid, int activityId) {
        String uri = endpoint + ResourceUris.GET_ACTIVITY_USER_SPREAD_STAT_URI.getUri();
        String method = ResourceUris.GET_ACTIVITY_USER_SPREAD_STAT_URI.getMethod();
        Map<String, String> params = new HashMap<>(8);
        params.put("aid", String.valueOf(aid));
        params.put("activityId", String.valueOf(activityId));
        Request request = HttpRequestUtils.buildRequest(uri, method, params);
        return doOperation(request, new TypeReference<Result<HdActivityUserSpreadStatVO>>() {
        });
    }
}
