package com.fkw.hdopen.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fkw.hdopen.comm.JsonUtils;

import java.util.Date;

/**
 * 互动开放账号注册VO
 *
 * @author CAJR
 * @version 1.0.0
 */
public class HdAccountRegisterVO {
    /**
     * 注册成功之后返回的aid
     */
    private Integer aid;

    private Integer type;

    private String partnerId;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
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
