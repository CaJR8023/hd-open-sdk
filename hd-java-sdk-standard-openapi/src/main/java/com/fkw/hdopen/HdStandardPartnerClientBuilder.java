package com.fkw.hdopen;

import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.auth.DefaultCredentialsProvider;

/**
 * @author CAJR
 * @Description standard partner client
 * @date 2021/9/9 13:55
 */
public class HdStandardPartnerClientBuilder implements ClientBuilder{
    @Override
    public HdStandardPartnerClient build(String clientId, String clientSecret) {
        return new HdStandardPartnerClient(getDefaultCredentialProvider(clientId, clientSecret), null);
    }

    @Override
    public HdStandardPartnerClient build(String clientId, String clientSecret, ClientConfiguration configuration) {
        return new HdStandardPartnerClient(getDefaultCredentialProvider(clientId, clientSecret), configuration);
    }

    @Override
    public HdStandardPartnerClient build(CredentialsProvider credentialsProvider) {
        return new HdStandardPartnerClient(credentialsProvider, null);
    }

    @Override
    public HdStandardPartnerClient build(CredentialsProvider credentialsProvider, ClientConfiguration configuration) {
        return new HdStandardPartnerClient(credentialsProvider, configuration);
    }

    private static DefaultCredentialsProvider getDefaultCredentialProvider(String clientId, String clientSecret) {
        return new DefaultCredentialsProvider(clientId, clientSecret);
    }
}
