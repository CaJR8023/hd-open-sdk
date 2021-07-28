package com.fkw.hdopen.comm;

/**
 * @author CAJR
 * @Description oauth2 常数
 * @date 2021/7/27 13:56
 */
public enum Oauth2Param {
    /**
     * oauth2 参数名称
     */
    GRANT_TYPE("grant_type"),
    SCOPE("scope"),
    CLIENT_CREDENTIALS("client_credentials"),
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
