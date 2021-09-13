package com.fkw.hdopen.operation.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fkw.hdopen.Operation;
import com.fkw.hdopen.comm.ResourceUris;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.comm.HttpRequestUtils;
import com.fkw.hdopen.model.HdOpenActivityVO;
import com.fkw.hdopen.model.PageResult;
import com.fkw.hdopen.model.Result;
import com.fkw.hdopen.model.request.CallHdOpenActivitiesPageApiVO;
import com.fkw.hdopen.operation.IHdOpenActivityOperation;
import okhttp3.Request;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * @author faisco
 * @Description 互动活动开放业务接口 impl
 * @date 2021/9/9 13:40
 */
public class HdOpenActivityOperation extends Operation implements IHdOpenActivityOperation {

    public HdOpenActivityOperation(URI endpoint, ServiceClient client, CredentialsProvider credentialsProvider) {
        super(endpoint, client, credentialsProvider);
    }

    @Override
    public Result<HdOpenActivityVO> getOneHdActivityInfo(int aid, int activityId) {
        String uri = endpoint + ResourceUris.GET_ONE_ACTIVITY_INFO_URI.getUri();
        String method = ResourceUris.GET_ONE_ACTIVITY_INFO_URI.getMethod();
        Map<String, String> params = new HashMap<>(8);
        params.put("aid", String.valueOf(aid));
        params.put("activityId", String.valueOf(activityId));
        Request request = HttpRequestUtils.buildRequest(uri, method, params);
        return doOperation(request, new TypeReference<Result<HdOpenActivityVO>>() {
        });
    }

    @Override
    public PageResult<HdOpenActivityVO> getHdActivityInfoByPage(int aid, Integer pageNo, Integer pageSize) {
        CallHdOpenActivitiesPageApiVO vo = new CallHdOpenActivitiesPageApiVO()
                .setAid(aid)
                .setPageNo(pageNo)
                .setPageSize(pageSize);
        return getHdActivityInfoByPage(vo);
    }

    @Override
    public PageResult<HdOpenActivityVO> getHdActivityInfoByPage(CallHdOpenActivitiesPageApiVO vo) {
        String uri = endpoint + ResourceUris.GET_PAGE_ACTIVITY_INFO_LIST_URI.getUri();
        String method = ResourceUris.GET_PAGE_ACTIVITY_INFO_LIST_URI.getMethod();
        Request request = HttpRequestUtils.buildRequest(uri, method, vo);
        return doOperation(request, new TypeReference<PageResult<HdOpenActivityVO>>() {
        });
    }
}
