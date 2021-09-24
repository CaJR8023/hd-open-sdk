package com.fkw.hdopen.comm;

/**
 * oauth2 常数
 *
 * @author CAJR
 * @version 1.0.0
 */
public enum Oauth2Param {
    /**
     * oauth2 参数名称
     */
    GRANT_TYPE("grant_type"),
    AUTH_TYPE("auth_type"),
    SCOPE("scope"),
    SDK_AUTH_TYPE("sdk"),
    CLIENT_CREDENTIALS("client_credentials"),
    REFRESH_TOKEN("refresh_token"),
    ACCESS_TOKEN("access_token"),
    TOKEN_TYPE("token_type"),
    EXPIRES_IN("expires_in"),

    ;

    private final String paramName;

    Oauth2Param(String paramName) {
        this.paramName = paramName;
    }

    public String getParamName() {
        return paramName;
    }

    @Override
    public String toString() {
        return this.paramName;
    }
}
