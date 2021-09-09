package com.fkw.hdopen.model;

import com.fkw.hdopen.Operation;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;

import java.net.URI;

/**
 * @author CAJR
 * @Description 授权认证操作
 * @date 2021/7/28 11:19
 */
public class AuthOperation extends Operation {

    public AuthOperation(URI endpoint, ServiceClient client, CredentialsProvider credentialsProvider) {
        super(endpoint, client, credentialsProvider);
    }
}
