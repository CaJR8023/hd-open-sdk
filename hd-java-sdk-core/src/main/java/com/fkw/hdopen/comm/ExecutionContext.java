package com.fkw.hdopen.comm;

import com.fkw.hdopen.ClientConfiguration;
import com.fkw.hdopen.auth.Credentials;
import com.fkw.hdopen.exception.InvalidCredentialsException;
import okhttp3.*;

import java.io.IOException;
import java.util.Base64;
import java.util.Objects;

/**
 * 请求执行上下文, 存储token
 *
 * @author CAJR
 * @version 1.0.0
 */
public class ExecutionContext {
    private Credentials credentials;
    private volatile static TokenContext context;

    public ExecutionContext(Credentials credentials) {
        this.credentials = credentials;
    }

    public void init(ClientConfiguration configuration, OkHttpClient client) {
        if (context == null) {
            synchronized (ExecutionContext.class) {
                if (context == null) {
                    initTokenContext(configuration, client);
                } else {
                    if (context.getTokenExpireTime() <= System.currentTimeMillis()) {
                        refreshTokenContext(configuration, client);
                    }
                }
            }
        }
    }

    private void initTokenContext(ClientConfiguration configuration, OkHttpClient client) {
        Request request = getCredentialsRequest(configuration);
        try {
            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()) {
                throw new InvalidCredentialsException("Init oauth token fail: " + response);
            }
            ExecutionContext.context = JsonUtils.toBean(Objects.requireNonNull(response.body()).string(), TokenContext.class);
            ExecutionContext.context.setTokenExpireTime(ExecutionContext.context.getExpiresIn() + System.currentTimeMillis());
        } catch (IOException e) {
            e.printStackTrace();
            throw new InvalidCredentialsException("Init oauth token fail");
        }
    }

    private void refreshTokenContext(ClientConfiguration configuration, OkHttpClient client) {
        Request request = getRefreshCredentialsRequest(configuration);
        try {
            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()) {
                throw new InvalidCredentialsException("Refresh oauth token fail response " + response);
            }
            ExecutionContext.context = JsonUtils.toBean(Objects.requireNonNull(response.body()).string(), TokenContext.class);
            ExecutionContext.context.setTokenExpireTime(ExecutionContext.context.getExpiresIn() + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
            throw new InvalidCredentialsException("Refresh oauth token fail: " + e.getMessage());
        }
    }

    public Request getCredentialsRequest(ClientConfiguration configuration) {
        String authUri = configuration.getProtocol().toString() + "://" + configuration.getClientAuthCname() + "/oauth/sdk/token";
        RequestBody body = new FormBody.Builder()
                .add(Oauth2Param.AUTH_TYPE.toString(), Oauth2Param.SDK_AUTH_TYPE.toString())
                .add(Oauth2Param.SCOPE.toString(), configuration.getAuthScope())
                .build();
        return new Request.Builder()
                .url(authUri)
                .addHeader(Header.AUTHORIZATION.toString(), getBasicHeadSinger())
                .post(body)
                .build();
    }

    public Request getRefreshCredentialsRequest(ClientConfiguration configuration) {
        String authUri = configuration.getProtocol().toString() + "://" + configuration.getClientAuthCname() + "/oauth/token";
        RequestBody body = new FormBody.Builder()
                .add(Oauth2Param.GRANT_TYPE.toString(), Oauth2Param.REFRESH_TOKEN.toString())
                .add(Oauth2Param.REFRESH_TOKEN.toString(), ExecutionContext.context.getRefreshToken())
                .add(Oauth2Param.SCOPE.toString(), configuration.getAuthScope())
                .build();
        return new Request.Builder()
                .url(authUri)
                .addHeader(Header.AUTHORIZATION.toString(), getBasicHeadSinger())
                .post(body)
                .build();
    }

    private String getBasicHeadSinger() {
        String auth = this.credentials.getClientId() + ":" + this.credentials.getClientSecret();
        return Header.BASIC.toString() + " " + Base64.getEncoder().encodeToString(auth.getBytes());
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public String getAccessToken() {
        return context.getAccessToken();
    }

    public String getType() {
        return context.getType();
    }

    public String getScope() {
        return context.getScope();
    }

    public long getTokenExpireTime() {
        return context.getTokenExpireTime();
    }
}
