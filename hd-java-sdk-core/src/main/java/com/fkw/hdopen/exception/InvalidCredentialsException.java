package com.fkw.hdopen.exception;

/**
 * 无效证书异常
 *
 * @author CAJR
 * @version 1.0.0
 */
public class InvalidCredentialsException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public InvalidCredentialsException() {
    }

    public InvalidCredentialsException(String message) {
        super(message);
    }

    public InvalidCredentialsException(Throwable cause) {
        super(cause);
    }

    public InvalidCredentialsException(String message, Throwable cause) {
        super(message, cause);
    }
}
