package com.fkw.hdopen.comm;

import java.util.HashMap;
import java.util.Map;

/**
 * http method
 *
 * @author CAJR
 * @version 1.0.0
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

        for (HttpMethod httpMethod : var0) {
            MAPPINGS.put(httpMethod.name(), httpMethod);
        }

    }
}
