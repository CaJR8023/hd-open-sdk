package com.fkw.hdopen.exception;

/**
 * @author CAJR
 * @Description 操作异常
 * @date 2021/7/27 15:04
 */
public class OperationException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public OperationException() {
    }

    public OperationException(String message) {
        super(message);
    }

    public OperationException(Throwable cause) {
        super(cause);
    }

    public OperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
