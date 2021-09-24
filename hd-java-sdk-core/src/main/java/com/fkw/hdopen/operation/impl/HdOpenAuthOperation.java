package com.fkw.hdopen.operation.impl;

import com.fkw.hdopen.Operation;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;

import java.net.URI;

/**
 * 互动开放授权认证操作
 *
 * @author CAJR
 * @version 1.0.0
 */
public class HdOpenAuthOperation extends Operation {

    public HdOpenAuthOperation(URI endpoint, ServiceClient client, CredentialsProvider credentialsProvider) {
        super(endpoint, client, credentialsProvider);
    }
}
