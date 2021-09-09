package com.fkw.hdopen.exception;

import com.fkw.hdopen.comm.HttpStatus;
import okhttp3.Headers;

import java.nio.charset.Charset;

/**
 * @author CAJR
 * @Description http status code exception
 * @date 2021/9/9 16:48
 */
public class HttpStatusCodeException extends PartnerClientResponseException {
    private final HttpStatus statusCode;

    protected HttpStatusCodeException(HttpStatus statusCode) {
        this(statusCode, statusCode.name(), null, null, null);
    }

    protected HttpStatusCodeException(HttpStatus statusCode, String statusText) {
        this(statusCode, statusText, null, null, null);
    }

    protected HttpStatusCodeException(HttpStatus statusCode, String statusText, byte[] responseBody, Charset responseCharset) {
        this(statusCode, statusText, null, responseBody, responseCharset);
    }

    protected HttpStatusCodeException(HttpStatus statusCode, String statusText, Headers responseHeaders, byte[] responseBody, Charset responseCharset) {
        super(statusCode.value() + " " + statusText, statusCode.value(), statusText, responseHeaders, responseBody, responseCharset);
        this.statusCode = statusCode;
    }

    public HttpStatus getStatusCode() {
        return this.statusCode;
    }
}
