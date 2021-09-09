package com.fkw.hdopen.comm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CAJR
 * @Description http method
 * @date 2021/9/9 18:26
 */
public enum HttpMethod {
    /**
     * http method
     */
    GET,
    HEAD,
    POST,
    PUT,
    PATCH,
    DELETE,
    OPTIONS,
    TRACE;

    private static final Map<String, HttpMethod> MAPPINGS = new HashMap<>(16);

    private HttpMethod() {
    }

    public static HttpMethod resolve(String method) {
        return method != null ? MAPPINGS.get(method) : null;
    }

    public boolean matches(String method) {
        return this == resolve(method);
    }

    static {
        HttpMethod[] var0 = values();
        int var1 = var0.length;

        for (int var2 = 0; var2 < var1; ++var2) {
            HttpMethod httpMethod = var0[var2];
            MAPPINGS.put(httpMethod.name(), httpMethod);
        }

    }
}
