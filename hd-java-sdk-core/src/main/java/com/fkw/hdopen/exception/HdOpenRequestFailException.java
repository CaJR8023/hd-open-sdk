package com.fkw.hdopen.exception;

/**
 * 无效证书异常
 *
 * @author CAJR
 * @version 1.0.5
 */
public class HdOpenRequestFailException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public HdOpenRequestFailException() {
    }

    public HdOpenRequestFailException(String message) {
        super(message);
    }

    public HdOpenRequestFailException(Throwable cause) {
        super(cause);
    }

    public HdOpenRequestFailException(String message, Throwable cause) {
        super(message, cause);
    }
}
