package com.fkw.hdopen.operation.impl;

import com.fkw.hdopen.Operation;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.operation.IHdOpenActivitySpreadStatOperation;

import java.net.URI;

/**
 * @author faisco
 * @Description 互动活动传播数据开放业务接口
 * @date 2021/9/9 13:40
 */
public class HdOpenActivitySpreadStatOperation extends Operation implements IHdOpenActivitySpreadStatOperation {

    public HdOpenActivitySpreadStatOperation(URI endpoint, ServiceClient client, CredentialsProvider credentialsProvider) {
        super(endpoint, client, credentialsProvider);
    }
}
