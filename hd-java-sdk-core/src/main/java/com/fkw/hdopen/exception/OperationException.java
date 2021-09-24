package com.fkw.hdopen.exception;

/**
 * 操作异常
 *
 * @author CAJR
 * @version 1.0.0
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
