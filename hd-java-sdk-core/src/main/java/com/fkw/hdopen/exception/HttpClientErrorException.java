package com.fkw.hdopen.exception;

import com.fkw.hdopen.comm.HttpStatus;

import java.nio.charset.Charset;

/**
 * http client error (4xx)
 *
 * @author CAJR
 * @version 1.0.0
 */
public class HttpClientErrorException extends HttpStatusCodeException {

    public HttpClientErrorException(HttpStatus statusCode) {
        super(statusCode);
    }

    public HttpClientErrorException(HttpStatus statusCode, String statusText) {
        super(statusCode, statusText);
    }

    public HttpClientErrorException(HttpStatus statusCode, String statusText, byte[] responseBody, Charset responseCharset) {
        super(statusCode, statusText, responseBody, responseCharset);
    }
}
