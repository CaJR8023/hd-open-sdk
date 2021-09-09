package com.fkw.hdopen.operation.impl;

import com.fkw.hdopen.Operation;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.operation.IHdOpenActivityUserOperation;

import java.net.URI;

/**
 * @author faisco
 * @Description 互动活动用户(C端用户)数据开放业务接口
 * @date 2021/9/9 13:43
 */
public class HdOpenActivityUserOperation extends Operation implements IHdOpenActivityUserOperation {

    public HdOpenActivityUserOperation(URI endpoint, ServiceClient client, CredentialsProvider credentialsProvider) {
        super(endpoint, client, credentialsProvider);
    }
}
