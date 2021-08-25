package com.fkw.hdopen.comm;

import com.fkw.hdopen.ClientConfiguration;
import com.fkw.hdopen.auth.Credentials;
import com.fkw.hdopen.exception.InvalidCredentialsException;
import okhttp3.*;

import java.io.IOException;
import java.util.Base64;
import java.util.Objects;

/**
 * @author CAJR
 * @Description 请求执行上下文, 存储token
 * @date 2021/7/26 17:33
 */
public class ExecutionContext {
    private Credentials credentials;
    private static TokenContext context;

    public ExecutionContext(Credentials credentials) {
        this.credentials = credentials;
    }

    public void init(ClientConfiguration configuration, OkHttpClient client) {
        if (context == null) {
            initContext(configuration, client);
        } else {
            if (context.getTokenExpireTime() <= System.currentTimeMillis()) {
                initContext(configuration, client);
            }
        }
    }

    private void initContext(ClientConfiguration configuration, OkHttpClient client) {
        Request request = getCredentialsRequest(configuration);
        try {
            Response response = client.newCall(request).execute();
            ExecutionContext.context = JsonUtils.toBean(Objects.requireNonNull(response.body()).string(), TokenContext.class);
        } catch (IOException e) {
            e.printStackTrace();
            throw new InvalidCredentialsException("Init oauth token fail");
        }
    }

    public Request getCredentialsRequest(ClientConfiguration configuration) {
        String authUri = configuration.getProtocol().toString() + "://" + configuration.getClientAuthCname() + "/oauth/token";
        RequestBody body = new FormBody.Builder()
                .add(Oauth2Param.GRANT_TYPE.toString(), Oauth2Param.CLIENT_CREDENTIALS.toString())
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
