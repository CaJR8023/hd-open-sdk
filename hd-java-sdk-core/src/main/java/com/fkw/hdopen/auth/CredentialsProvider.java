package com.fkw.hdopen.auth;

/**
 * @author CAJR
 * @Description 证书提供者
 * @date 2021/7/26 11:26
 */
public interface CredentialsProvider {
    void setCredentials(Credentials credentials);

    Credentials getCredentials();
}
