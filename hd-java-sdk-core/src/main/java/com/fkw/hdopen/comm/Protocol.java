package com.fkw.hdopen.comm;

/**
 * @author CAJR
 * @Description 协议
 * @date 2021/7/26 15:16
 */
public enum Protocol {
    /**
     * http协议
     */
    HTTP("http"),
    HTTPS("https");

    private final String protocol;

    private Protocol(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public String toString() {
        return this.protocol;
    }
}