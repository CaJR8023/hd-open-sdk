package com.fkw.hdopen.comm;

import com.google.gson.annotations.SerializedName;

/**
 * @author CAJR
 * @Description 令牌
 * @date 2021/7/27 13:47
 */
public class TokenContext {

    @SerializedName("access_token")
    private String accessToken;
    @SerializedName("token_type")
    private String type;
    private String scope;
    @SerializedName("expires_in")
    private long tokenExpireTime;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public long getTokenExpireTime() {
        return System.currentTimeMillis()+this.tokenExpireTime;
    }

    public void setTokenExpireTime(long tokenExpireTime) {
        this.tokenExpireTime = tokenExpireTime;
    }
}
