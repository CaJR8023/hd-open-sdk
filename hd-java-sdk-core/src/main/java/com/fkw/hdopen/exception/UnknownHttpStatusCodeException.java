package com.fkw.hdopen.exception;

import okhttp3.Headers;
import okhttp3.internal.http.HttpHeaders;

import java.nio.charset.Charset;

/**
 * unknown http status code exception
 *
 * @author CAJR
 * @version 1.0.0
 */
public class UnknownHttpStatusCodeException extends PartnerClientResponseException {
    public UnknownHttpStatusCodeException(int rawStatusCode, String statusText, Headers responseHeaders, byte[] responseBody, Charset responseCharset) {
        super("Unknown status code [" + rawStatusCode + "] " + statusText, rawStatusCode, statusText, responseHeaders, responseBody, responseCharset);
    }
}
