package com.fkw.hdopen.comm;

/**
 * 请求头枚举
 *
 * @author CAJR
 * @version 1.0.0
 */
public enum Header {
    /**
     * 请求头参数
     */
    AUTHORIZATION("Authorization"),
    BASIC("Basic"),
    BEARER("Bearer"),
    ;

    private final String headName;

    Header(String headName) {
        this.headName = headName;
    }

    public String getHeadName() {
        return headName;
    }

    @Override
    public String toString() {
        return this.headName;
    }
}
