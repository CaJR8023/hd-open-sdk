package com.fkw.hdopen;

import com.fkw.hdopen.auth.CredentialsProvider;

/**
 * @author CAJR
 * @Description TODO
 * @date 2021/9/9 13:55
 */
public class HdStandardPartnerClientBuilder implements ClientBuilder{
    @Override
    public HdPartner build(String clientId, String clientSecret) {
        return null;
    }

    @Override
    public HdPartner build(String clientId, String clientSecret, ClientConfiguration configuration) {
        return null;
    }

    @Override
    public HdPartner build(CredentialsProvider credentialsProvider) {
        return null;
    }

    @Override
    public HdPartner build(CredentialsProvider credentialsProvider, ClientConfiguration configuration) {
        return null;
    }
}
