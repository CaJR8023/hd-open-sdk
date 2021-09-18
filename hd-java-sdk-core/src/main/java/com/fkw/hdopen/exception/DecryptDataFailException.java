package com.fkw.hdopen.exception;

/**
 * @author CAJR
 * @Description 解密异常
 * @date 2021/9/18 15:13
 */
public class DecryptDataFailException extends OperationException{
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
