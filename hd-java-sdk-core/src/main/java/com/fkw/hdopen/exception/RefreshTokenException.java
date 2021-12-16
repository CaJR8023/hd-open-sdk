package com.fkw.hdopen.exception;

/**
 * 刷新token出错异常
 *
 * @author CAJR
 * @version 1.0.5
 */
public class RefreshTokenException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public RefreshTokenException() {
    }

    public RefreshTokenException(String message) {
        super(message);
    }

    public RefreshTokenException(Throwable cause) {
        super(cause);
    }

    public RefreshTokenException(String message, Throwable cause) {
        super(message, cause);
    }
}
