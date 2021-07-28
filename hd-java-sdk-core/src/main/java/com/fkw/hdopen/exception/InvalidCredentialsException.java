package com.fkw.hdopen.exception;

/**
 * @author CAJR
 * @Description 无效证书异常
 * @date 2021/7/26 11:54
 */
public class InvalidCredentialsException extends RuntimeException{
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
