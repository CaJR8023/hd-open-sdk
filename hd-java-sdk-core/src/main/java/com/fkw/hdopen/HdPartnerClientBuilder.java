package com.fkw.hdopen;


import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.auth.DefaultCredentialsProvider;

/**
 * @author CAJR
 * @Description 合作方客户端生成器
 * @date 2021/7/26 10:33
 */
public class HdPartnerClientBuilder implements ClientBuilder{
    public HdPartnerClientBuilder() {
    }

    @Override
    public HdPartner build(String clientId, String clientSecret) {
        return new HdPartnerClient(getDefaultCredentialProvider(clientId, clientSecret), null);
    }

    @Override
    public HdPartner build(String clientId, String clientSecret, ClientConfiguration configuration) {
        return new HdPartnerClient(getDefaultCredentialProvider(clientId, clientSecret), configuration);
    }

    @Override
    public HdPartner build(CredentialsProvider credentialsProvider) {
        return new HdPartnerClient(credentialsProvider, null);
    }

    @Override
    public HdPartner build(CredentialsProvider credentialsProvider, ClientConfiguration configuration) {
        return new HdPartnerClient(credentialsProvider, configuration);
    }

    private static DefaultCredentialsProvider getDefaultCredentialProvider(String clientId, String clientSecret) {
        return new DefaultCredentialsProvider(clientId, clientSecret);
    }
}
