package com.fkw.hdopen;


import com.fkw.hdopen.auth.CredentialsProvider;

/**
 * 客户端生成接口类
 *
 * @author CAJR
 * @version 1.0.0
 */
public interface ClientBuilder {

    HdPartner build(String clientId, String clientSecret);

    HdPartner build(String clientId, String clientSecret, ClientConfiguration configuration);

    HdPartner build(CredentialsProvider credentialsProvider);

    HdPartner build(CredentialsProvider credentialsProvider, ClientConfiguration configuration);

}
