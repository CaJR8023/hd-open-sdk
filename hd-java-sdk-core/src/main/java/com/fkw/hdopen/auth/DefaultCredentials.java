package com.fkw.hdopen.auth;

import com.fkw.hdopen.exception.InvalidCredentialsException;

/**
 * 默认客户端凭证
 *
 * @author CAJR
 * @version 1.0.0
 */
public class DefaultCredentials implements Credentials {

    private final String clientId;
    private final String clientSecret;
    private final String securityToken;

    public DefaultCredentials(String accessKeyId, String secretAccessKey) {
        this(accessKeyId, secretAccessKey, null);
    }

    public DefaultCredentials(String clientId, String clientSecret, String securityToken) {
        if (clientId != null && !"".equals(clientId)) {
            if (clientSecret != null && !"".equals(clientSecret)) {
                this.clientId = clientId;
                this.clientSecret = clientSecret;
                this.securityToken = securityToken;
            } else {
                throw new InvalidCredentialsException("Client secret should not be null or empty.");
            }
        } else {
            throw new InvalidCredentialsException("Client id should not be null or empty.");
        }
    }

    @Override
    public String getClientId() {
        return this.clientId;
    }

    @Override
    public String getClientSecret() {
        return this.clientSecret;
    }

    @Override
    public String getSecurityToken() {
        return securityToken;
    }

}
