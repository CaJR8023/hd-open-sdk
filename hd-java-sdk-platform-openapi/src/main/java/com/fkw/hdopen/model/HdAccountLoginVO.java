package com.fkw.hdopen.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fkw.hdopen.comm.JsonUtils;

import java.util.Date;

/**
 * @author CAJR
 * @Description 互动账号登录封装VO
 * @date 2021/9/13 10:10
 */
public class HdAccountLoginVO {

    /**
     * 要登录的aid
     */
    private Integer aid;

    private Integer type;

    private String partnerId;

    @JsonProperty("redirect_url")
    private String redirectUrl;

    private Date date;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return JsonUtils.toString(this);
    }
}
