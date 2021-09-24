package com.fkw.hdopen.exception;

/**
 * 校验签名异常
 *
 * @author CAJR
 * @version 1.0.0
 */
public class VerifySignFailException extends OperationException {

    private static final long serialVersionUID = 1L;

    public VerifySignFailException() {
    }

    public VerifySignFailException(String message) {
        super(message);
    }

    public VerifySignFailException(Throwable cause) {
        super(cause);
    }

    public VerifySignFailException(String message, Throwable cause) {
        super(message, cause);
    }
}
