package com.fkw.hdopen;

/**
 * @author CAJR
 * @Description hd open resource api
 * @date 2021/9/13 10:25
 */
public enum ResourceUris {
    /**
     * resources api
     */
    HD_OPEN_REGISTER("/account/hd-register", "POST"),
    HD_OPEN_LOGIN("/account/hd-login", "POST"),
    ;
    private final String uri;
    private final String method;

    ResourceUris(String uri, String method) {
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
