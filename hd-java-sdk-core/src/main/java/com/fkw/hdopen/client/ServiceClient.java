package com.fkw.hdopen.client;

import com.fkw.hdopen.ClientConfiguration;
import com.fkw.hdopen.comm.ExecutionContext;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * 业务客户端
 *
 * @author CAJR
 * @version 1.0.0
 */
public abstract class ServiceClient {
    protected ClientConfiguration configuration;

    public ServiceClient(ClientConfiguration configuration) {
        this.configuration = configuration;
    }

    public ClientConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * 发送请求抽象方法
     *
     * @param request 请求
     * @param context 请求上下文
     * @return okhttp3.Response
     * @author CAJR
     */
    public abstract Response sendRequest(Request request, ExecutionContext context);
}
