package com.fkw.hdopen.exception;

/**
 * 解密异常
 *
 * @author CAJR
 * @version 1.0.0
 */
public class DecryptDataFailException extends OperationException {
    private static final long serialVersionUID = 1L;

    public DecryptDataFailException() {
    }

    public DecryptDataFailException(String message) {
        super(message);
    }

    public DecryptDataFailException(Throwable cause) {
        super(cause);
    }

    public DecryptDataFailException(String message, Throwable cause) {
        super(message, cause);
    }
}
