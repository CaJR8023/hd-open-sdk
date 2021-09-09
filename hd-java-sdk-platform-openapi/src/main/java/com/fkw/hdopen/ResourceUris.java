package com.fkw.hdopen;

/**
 * @author CAJR
 * @Description hd open resource api
 * @date 2021/7/27 15:47
 */
public enum ResourceUris {
    /**
     * test
     */
    BASE_CONTEXT_PREFIX_URI("/open-api", ""),
    GET_ONE_ACTIVITY_INFO_URI("/activities/one", "GET"),
    GET_PAGE_ACTIVITY_INFO_LIST_URI("/activities/list-page", "GET");
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
