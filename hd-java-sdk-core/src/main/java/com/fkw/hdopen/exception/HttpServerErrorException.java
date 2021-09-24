package com.fkw.hdopen.exception;

import com.fkw.hdopen.comm.HttpStatus;
import okhttp3.Headers;

import java.nio.charset.Charset;

/**
 * http server error(5xx)
 *
 * @author CAJR
 * @version 1.0.0
 */
public class HttpServerErrorException extends HttpStatusCodeException {

    public HttpServerErrorException(HttpStatus statusCode) {
        super(statusCode);
    }

    public HttpServerErrorException(HttpStatus statusCode, String statusText) {
        super(statusCode, statusText);
    }

    public HttpServerErrorException(HttpStatus statusCode, String statusText, byte[] responseBody, Charset responseCharset) {
        super(statusCode, statusText, responseBody, responseCharset);
    }

    public HttpServerErrorException(HttpStatus statusCode, String statusText, Headers responseHeaders, byte[] responseBody, Charset responseCharset) {
        super(statusCode, statusText, responseHeaders, responseBody, responseCharset);
    }

}
