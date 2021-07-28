package com.fkw.hdopen.auth;

import com.fkw.hdopen.exception.InvalidCredentialsException;

/**
 * @author CAJR
 * @Description 默认客户端凭证提供者
 * @date 2021/7/26 11:53
 */
public class DefaultCredentialsProvider implements CredentialsProvider{

    private volatile Credentials credentials;

    public DefaultCredentialsProvider(Credentials credentials) {
        this.credentials = credentials;
    }

    public DefaultCredentialsProvider(String clientId, String clientSecret) {
        this(clientId, clientSecret, null);
    }

    public DefaultCredentialsProvider(String clientId, String clientSecret, String securityToken) {
        checkCredentials(clientId, clientSecret);
        this.setCredentials(new DefaultCredentials(clientId, clientSecret, securityToken));
    }

    @Override
    public synchronized void setCredentials(Credentials credentials) {
        if (credentials == null ) {
            throw new InvalidCredentialsException("Credentials should not be null.");
        } else {
            checkCredentials(credentials.getClientId(), credentials.getClientSecret());
            this.credentials = credentials;
        }
    }

    @Override
    public Credentials getCredentials() {
        if (this.credentials == null ) {
            throw new InvalidCredentialsException("Invalid credentials");
        }
        return this.credentials;
    }

    /**
     *  检查凭证是否正确
     * @param clientId 客户端id
     * @param clientSecret 客户端secret
     * @author CAJR
     * @date 2021/7/26
     */
    private static void checkCredentials(String clientId, String clientSecret) {
        if (clientId != null && !"".equals(clientId)) {
            if (clientSecret == null || "".equals(clientSecret)) {
                throw new InvalidCredentialsException("Client Secret should not be null or empty.");
            }
        } else {
            throw new InvalidCredentialsException("Client id should not be null or empty.");
        }
    }
}
