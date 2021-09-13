package com.fkw.hdopen.operation.impl;

import com.fkw.hdopen.Operation;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;

import java.net.URI;

/**
 * @author CAJR
 * @Description 互动开放授权认证操作
 * @date 2021/7/28 11:19
 */
public class HdOpenAuthOperation extends Operation {

    public HdOpenAuthOperation(URI endpoint, ServiceClient client, CredentialsProvider credentialsProvider) {
        super(endpoint, client, credentialsProvider);
    }
}
