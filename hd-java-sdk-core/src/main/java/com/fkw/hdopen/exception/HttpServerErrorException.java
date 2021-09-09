package com.fkw.hdopen.exception;

import com.fkw.hdopen.comm.HttpStatus;
import okhttp3.Headers;

import java.nio.charset.Charset;

/**
 * @author CAJR
 * @Description http server error(5xx)
 * @date 2021/9/9 16:45
 */
public class HttpServerErrorException extends HttpStatusCodeException{

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
