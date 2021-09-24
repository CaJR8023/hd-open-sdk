package com.fkw.hdopen.auth;

/**
 * 证书提供者
 *
 * @author CAJR
 * @version 1.0.0
 */
public interface CredentialsProvider {
    void setCredentials(Credentials credentials);

    Credentials getCredentials();
}
