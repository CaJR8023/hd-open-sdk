package com.fkw.hdopen.comm;

import com.fkw.hdopen.exception.OperationException;
import okhttp3.*;

import java.util.Map;
import java.util.Objects;

/**
 * HttpRequestUtils
 *
 * @author CAJR
 * @version 1.0.0
 */
public class HttpRequestUtils {

    public static Request buildRequest(String uri, String method, Object obj) {
        return buildRequest(uri, method, JsonUtils.toMap(obj, String.class, String.class));
    }

    public static Request buildRequest(String uri, String method, Map<String, String> params) {
        if (StringUtils.isAnyBlank(uri) || StringUtils.isAnyBlank(method)) {
            throw new OperationException("uri or method is null");
        }
        Request.Builder reqBuild = new Request.Builder();
        HttpUrl.Builder urlBuilder = Objects.requireNonNull(HttpUrl.parse(uri)).newBuilder();
        if (!CollectionUtils.isEmpty(params)) {
            params.forEach(urlBuilder::addQueryParameter);
        }
        reqBuild.url(urlBuilder.build());
        if (HttpMethod.GET.matches(method)) {
            return reqBuild.get().build();
        }
        if (HttpMethod.POST.matches(method) || HttpMethod.PUT.matches(method)) {
            return buildPostJsonRequest(uri, params);
        }
        return reqBuild.method(method, new FormBody.Builder().build()).build();
    }

    public static Request buildPostJsonRequest(String uri, Object obj) {
        return new Request.Builder()
                .url(uri)
                .post(RequestBody.Companion.create(JsonUtils.toString(obj), MediaType.Companion.parse("application/json")))
                .build();
    }
}
