package com.fkw.hdopen;

/**
 * hd open resource api
 *
 * @author CAJR
 * @version 1.0.0
 */
public enum ResourceUris {
    /**
     * resources api
     */
    HD_OPEN_REGISTER("/account/hd-register", "POST"),
    HD_OPEN_LOGIN("/account/hd-login", "POST"),
    HD_OEM_BIND("/account/oem-bind", "POST"),
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
