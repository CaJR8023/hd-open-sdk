package com.fkw.hdopen.exception;

import okhttp3.Headers;
import okhttp3.internal.http.HttpHeaders;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.logging.Logger;

/**
 * partner client response exception
 *
 * @author CAJR
 * @version 1.0.0
 */
public class PartnerClientResponseException extends OperationException {
    final static Logger logger = Logger.getLogger(PartnerClientResponseException.class.getSimpleName());
    private static final String DEFAULT_CHARSET = "ISO-8859-1";
    private final int rawStatusCode;
    private final String statusText;
    private final byte[] responseBody;
    private final Headers responseHeaders;
    private final String responseCharset;

    public PartnerClientResponseException(String message, int statusCode, String statusText, Headers responseHeaders, byte[] responseBody, Charset responseCharset) {
        super(message);
        this.rawStatusCode = statusCode;
        this.statusText = statusText;
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody != null ? responseBody : new byte[0];
        this.responseCharset = responseCharset != null ? responseCharset.name() : DEFAULT_CHARSET;
        logger.info("response body: [" + getResponseBodyAsString() + "]");
    }

    public int getRawStatusCode() {
        return this.rawStatusCode;
    }

    public String getStatusText() {
        return this.statusText;
    }

    public Headers getResponseHeaders() {
        return this.responseHeaders;
    }

    public byte[] getResponseBodyAsByteArray() {
        return this.responseBody;
    }

    public String getResponseBodyAsString() {
        try {
            return new String(this.responseBody, this.responseCharset);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
