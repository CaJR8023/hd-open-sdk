package com.fkw.hdopen.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fkw.hdopen.comm.JsonUtils;

import java.util.Date;

/**
 * @author CAJR
 * @version 1.0.0
 */
public class CallHdOpenLoginApiVO {

    /**
     * 要登录的aid
     */
    private Integer aid;

    /**
     * 要登录的合作方账号id
     */
    private String partnerId;

    /**
     * 登录成功后跳转的链接
     */
    @JsonProperty("callback_url")
    private String callbackUrl;

    /**
     * 登录日期
     */
    private Date date;

    public Integer getAid() {
        return aid;
    }

    public CallHdOpenLoginApiVO setAid(Integer aid) {
        this.aid = aid;
        return this;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public CallHdOpenLoginApiVO setPartnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public CallHdOpenLoginApiVO setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public CallHdOpenLoginApiVO setDate(Date date) {
        this.date = date;
        return this;
    }

    @Override
    public String toString() {
        return JsonUtils.toString(this);
    }
}
