package com.fkw.hdopen.model.request;

/**
 * @author CAJR
 * @Description 核销兑奖码VO
 * @date 2021/9/10 17:54
 */
public class CallHdOpenConsumeCodeApiVO {

    private Integer aid;

    private Integer activityId;

    private Integer activityUserId;

    /** 兑奖码 */
    private String code;

    /** 备注*/
    private String note;

    public Integer getAid() {
        return aid;
    }

    public CallHdOpenConsumeCodeApiVO setAid(Integer aid) {
        this.aid = aid;
        return this;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public CallHdOpenConsumeCodeApiVO setActivityId(Integer activityId) {
        this.activityId = activityId;
        return this;
    }

    public Integer getActivityUserId() {
        return activityUserId;
    }

    public CallHdOpenConsumeCodeApiVO setActivityUserId(Integer activityUserId) {
        this.activityUserId = activityUserId;
        return this;
    }

    public String getCode() {
        return code;
    }

    public CallHdOpenConsumeCodeApiVO setCode(String code) {
        this.code = code;
        return this;
    }

    public String getNote() {
        return note;
    }

    public CallHdOpenConsumeCodeApiVO setNote(String note) {
        this.note = note;
        return this;
    }
}
