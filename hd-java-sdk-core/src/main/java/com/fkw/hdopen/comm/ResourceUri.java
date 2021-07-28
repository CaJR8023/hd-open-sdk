package com.fkw.hdopen.comm;

/**
 * @author CAJR
 * @Description 资源URI
 * @date 2021/7/27 15:47
 */
public enum ResourceUri {
    /** test */
    PREFIX_URI("/open-api", ""),
    TEST_URI("/test/test-redis", "GET")

    ;
    private final String uri;
    private final String method;

    ResourceUri(String uri, String method) {
        this.uri = uri;
        this.method = method;
    }

    public String getUri() {
        return uri;
    }

    public String getMethod() {
        return method;
    }
}
