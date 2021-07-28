package com.fkw.hdopen;


import com.fkw.hdopen.auth.CredentialsProvider;

/**
 * @author CAJR
 * @Description 客户端生成接口类
 * @date 2021/7/26 11:58
 */
public interface ClientBuilder {

    HdPartner build(String clientId, String clientSecret);

    HdPartner build(String clientId, String clientSecret, ClientConfiguration configuration);

    HdPartner build(CredentialsProvider credentialsProvider);

    HdPartner build(CredentialsProvider credentialsProvider, ClientConfiguration configuration);

}
