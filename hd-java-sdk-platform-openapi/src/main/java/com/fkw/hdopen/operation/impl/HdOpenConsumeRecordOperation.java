package com.fkw.hdopen.operation.impl;

import com.fkw.hdopen.Operation;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.operation.IHdOpenConsumeRecordOperation;

import java.net.URI;

/**
 * @author faisco
 * @Description 互动核销记录开放业务接口
 * @date 2021/9/9 13:44
 */
public class HdOpenConsumeRecordOperation extends Operation implements IHdOpenConsumeRecordOperation {

    public HdOpenConsumeRecordOperation(URI endpoint, ServiceClient client, CredentialsProvider credentialsProvider) {
        super(endpoint, client, credentialsProvider);
    }
}
