package com.fkw.hdopen.operation.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fkw.hdopen.Operation;
import com.fkw.hdopen.comm.ResourceUris;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.comm.HttpRequestUtils;
import com.fkw.hdopen.model.HdActivityUserVO;
import com.fkw.hdopen.model.PageResult;
import com.fkw.hdopen.model.Result;
import com.fkw.hdopen.model.request.CallHdActivityUserAchievementApiVO;
import com.fkw.hdopen.model.request.CallHdOpenActivityUsersPageApiVO;
import com.fkw.hdopen.operation.IHdOpenActivityUserOperation;
import okhttp3.Request;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * 互动活动用户(C端用户)数据开放业务接口
 *
 * @author CAJR
 * @version 1.0.0
 */
public class HdOpenActivityUserOperation extends Operation implements IHdOpenActivityUserOperation {

    public HdOpenActivityUserOperation(URI endpoint, ServiceClient client, CredentialsProvider credentialsProvider) {
        super(endpoint, client, credentialsProvider);
    }

    @Override
    public Result<Integer> updateActivityUserAchievement(CallHdActivityUserAchievementApiVO vo) {
        String uri = endpoint + ResourceUris.UPDATE_ACTIVITY_USER_ACHIEVEMENT.getUri();
        String method = ResourceUris.UPDATE_ACTIVITY_USER_ACHIEVEMENT.getMethod();
        Request request = HttpRequestUtils.buildRequest(uri, method, vo);
        return doOperation(request, new TypeReference<Result<Integer>>() {
        });
    }

    @Override
    public Result<HdActivityUserVO> getOneHdActivityUserByFaiOpenId(int aid, int activityId, String faiOpenId) {
        String uri = endpoint + ResourceUris.GET_ONE_ACTIVITY_USER_BY_FAI_OPENID.getUri();
        String method = ResourceUris.GET_ONE_ACTIVITY_USER_BY_FAI_OPENID.getMethod();
        Map<String, String> params = new HashMap<>(8);
        params.put("aid", String.valueOf(aid));
        params.put("activityId", String.valueOf(activityId));
        params.put("faiOpenId", faiOpenId);
        Request request = HttpRequestUtils.buildRequest(uri, method, params);
        return doOperation(request, new TypeReference<Result<HdActivityUserVO>>() {
        });
    }

    @Override
    public PageResult<HdActivityUserVO> getActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo) {
        String uri = endpoint + ResourceUris.GET_ACTIVITY_USER_BY_PAGE.getUri();
        String method = ResourceUris.GET_ACTIVITY_USER_BY_PAGE.getMethod();
        Request request = HttpRequestUtils.buildRequest(uri, method, vo);
        return doOperation(request, new TypeReference<PageResult<HdActivityUserVO>>() {
        });
    }

    @Override
    public PageResult<HdActivityUserVO> getBlackActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo) {
        String uri = endpoint + ResourceUris.GET_BLACK_ACTIVITY_USER_BY_PAGE.getUri();
        String method = ResourceUris.GET_BLACK_ACTIVITY_USER_BY_PAGE.getMethod();
        Request request = HttpRequestUtils.buildRequest(uri, method, vo);
        return doOperation(request, new TypeReference<PageResult<HdActivityUserVO>>() {
        });
    }

    @Override
    public PageResult<HdActivityUserVO> getPrizeActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo) {
        String uri = endpoint + ResourceUris.GET_PRIZE_ACTIVITY_USER_BY_PAGE.getUri();
        String method = ResourceUris.GET_PRIZE_ACTIVITY_USER_BY_PAGE.getMethod();
        Request request = HttpRequestUtils.buildRequest(uri, method, vo);
        return doOperation(request, new TypeReference<PageResult<HdActivityUserVO>>() {
        });
    }
}
