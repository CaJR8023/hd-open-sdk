package com.fkw.hdopen.operation.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fkw.hdopen.Operation;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.comm.HttpRequestUtils;
import com.fkw.hdopen.comm.ResourceUris;
import com.fkw.hdopen.model.HdOpenOrderVO;
import com.fkw.hdopen.model.PageResult;
import com.fkw.hdopen.operation.IHdOpenOrderOperation;
import okhttp3.Request;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
/**
 * 互动订单开放业务实现类
 *
 * @author HLS 2021/12/24 15:48
 * @version 1.0.8
 */
public class HdOpenOrderOperation extends Operation implements IHdOpenOrderOperation {

    public HdOpenOrderOperation(URI endpoint, ServiceClient client, CredentialsProvider credentialsProvider) {
        super(endpoint, client, credentialsProvider);
    }

    @Override
    public PageResult<HdOpenOrderVO> getHdOrderInfoList(int aid, int activityId, Integer pageNo, Integer pageSize) {
        // 获取链接以及请求方式
        String uri = endpoint + ResourceUris.GET_ORDER_LIST.getUri();
        String method = ResourceUris.GET_ORDER_LIST.getMethod();

        // 拼接请求参数
        Map<String, String> params = new HashMap<>(8);
        params.put("aid", String.valueOf(aid));
        params.put("activityId", String.valueOf(activityId));
        params.put("pageNo", String.valueOf(pageNo));
        params.put("pageSize", String.valueOf(pageSize));

        // 生成链接请求
        Request request = HttpRequestUtils.buildRequest(uri, method, params);
        return doOperation(request, new TypeReference<PageResult<HdOpenOrderVO>>() {
        });
    }
}
