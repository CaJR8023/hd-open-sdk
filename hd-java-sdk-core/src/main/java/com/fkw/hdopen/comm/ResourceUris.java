package com.fkw.hdopen.comm;

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
    BASE_CONTEXT_PREFIX_URI("/open-api", ""),
    GET_ONE_ACTIVITY_INFO_URI("/activities/one", "GET"),
    GET_PAGE_ACTIVITY_INFO_LIST_URI("/activities/list-page", "GET"),
    GET_ACTIVITY_SPREAD_STAT_LEVEL_URI("/activity-spread-stat/level", "GET"),
    GET_ACTIVITY_USER_SPREAD_STAT_URI("/activity-spread-stat/user", "GET"),

    UPDATE_ACTIVITY_USER_ACHIEVEMENT("/activity-user/achievement", "POST"),
    GET_ONE_ACTIVITY_USER_BY_FAI_OPENID("/activity-user/one", "GET"),
    GET_ACTIVITY_USER_BY_PAGE("/activity-user/list-page", "GET"),
    GET_BLACK_ACTIVITY_USER_BY_PAGE("/activity-user/black-list-page", "GET"),
    GET_PRIZE_ACTIVITY_USER_BY_PAGE("/activity-user/winners-page", "GET"),

    GET_CONSUME_RECORD_BY_PAGE("/consume/record-list-page", "GET"),
    GET_CODE_STATUS("/consume/code-status", "GET"),
    CONSUME_CODE("/consume/code", "POST"),
    GET_RED_PACKET_RECORD("/consume/red-packet-record", "GET"),
    GET_PUBLIC_KEY("/security/public-key", "GET"),
    CHANGE_TO_LONG_URL("/tool/long-url", "GET"),
    CHANGE_TO_SHORT_URL("/tool/short-url", "GET"),

    /* 订单相关接口 */
    GET_ORDER_LIST("/order/list-page", "GET"),
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
