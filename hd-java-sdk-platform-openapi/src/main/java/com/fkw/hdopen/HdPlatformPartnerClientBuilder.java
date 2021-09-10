package com.fkw.hdopen;

import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.auth.DefaultCredentialsProvider;

/**
 * @author CAJR
 * @Description platform partner client builder
 * @date 2021/9/9 13:55
 */
public class HdPlatformPartnerClientBuilder implements ClientBuilder{

    @Override
    public HdPlatformPartnerClient build(String clientId, String clientSecret) {
        return new HdPlatformPartnerClient(getDefaultCredentialProvider(clientId, clientSecret), null);
    }

    @Override
    public HdPlatformPartnerClient build(String clientId, String clientSecret, ClientConfiguration configuration) {
        return new HdPlatformPartnerClient(getDefaultCredentialProvider(clientId, clientSecret), configuration);
    }

    @Override
    public HdPlatformPartnerClient build(CredentialsProvider credentialsProvider) {
        return new HdPlatformPartnerClient(credentialsProvider, null);
    }

    @Override
    public HdPlatformPartnerClient build(CredentialsProvider credentialsProvider, ClientConfiguration configuration) {
        return new HdPlatformPartnerClient(credentialsProvider, configuration);
    }

    private static DefaultCredentialsProvider getDefaultCredentialProvider(String clientId, String clientSecret) {
        return new DefaultCredentialsProvider(clientId, clientSecret);
    }
}
