package com.fkw.hdopen.comm;

/**
 * @author CAJR
 * @Description 请求头枚举
 * @date 2021/7/27 12:16
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
