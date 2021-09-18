package com.fkw.hdopen.exception;

/**
 * @author CAJR
 * @Description 校验签名异常
 * @date 2021/9/18 15:12
 */
public class VerifySignFailException extends OperationException{

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
