package com.fkw.hdopen.operation.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fkw.hdopen.Operation;
import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.client.ServiceClient;
import com.fkw.hdopen.comm.HttpRequestUtils;
import com.fkw.hdopen.comm.RSAUtils;
import com.fkw.hdopen.comm.ResourceUris;
import com.fkw.hdopen.exception.DecryptDataFailException;
import com.fkw.hdopen.exception.VerifySignFailException;
import com.fkw.hdopen.model.Result;
import com.fkw.hdopen.operation.IOpenSecurityOperation;
import okhttp3.Request;

import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/**
 * @author CAJR
 * @Description 开放安全操作接口实现类
 * @date 2021/9/16 10:44
 */
public class OpenSecurityOperation extends Operation implements IOpenSecurityOperation {
    public OpenSecurityOperation(URI endpoint, ServiceClient client, CredentialsProvider credentialsProvider) {
        super(endpoint, client, credentialsProvider);
    }

    @Override
    public Result<String> getPublicKey() {
        String uri = endpoint + ResourceUris.GET_PUBLIC_KEY.getUri();
        String method = ResourceUris.GET_PUBLIC_KEY.getMethod();
        Request request = HttpRequestUtils.buildRequest(uri, method, new HashMap<>(2));
        return doOperation(request, new TypeReference<Result<String>>() {
        });
    }

    @Override
    public String decryptByRsaPublicKey(String publicKey, String sign, String encryptedData) {
        String decryptedData;
        try {
            sign = URLDecoder.decode(sign, StandardCharsets.UTF_8.name()).replace(" ", "+");
            encryptedData = URLDecoder.decode(encryptedData, StandardCharsets.UTF_8.name()).replace(" ", "+");
            if (!RSAUtils.verify(publicKey, encryptedData, sign)) {
                throw new VerifySignFailException("Verification signature failed: " + sign);
            }

            decryptedData = RSAUtils.decryptByPublicKey(publicKey, encryptedData);
        } catch (Exception e) {
            throw new DecryptDataFailException(e);
        }
        return decryptedData;
    }
}
