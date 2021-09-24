package com.fkw.hdopen.comm;

/**
 * http协议
 *
 * @author CAJR
 * @version 1.0.0
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