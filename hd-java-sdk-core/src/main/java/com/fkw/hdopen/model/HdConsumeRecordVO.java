package com.fkw.hdopen.model;

/**
 * HdConsumeRecordVO
 *
 * @author CAJR
 * @version 1.0.0
 */
public class HdConsumeRecordVO {

    /**
     * 奖品名称
     */
    private String award;

    /**
     * 奖品名称
     */
    private Integer awardLevel;

    /**
     * 核销时间
     */
    private Long consumeTime;

    /**
     * 核销类型
     */
    private Integer consumeType;

    /**
     * 核销员名称
     */
    private String consumer;

    /**
     * 核销员id
     */
    private Integer consumerId;

    /**
     * 兑奖码
     */
    private String code;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 活动C端用户id
     */
    private Integer activityUserId;

    /**
     * 活动C端用户名称
     */
    private String activityUserName;

    /**
     * activityUserInfo
     */
    private HdActivityUserInfoVO activityUserInfo;

    /**
     * 核销备注
     */
    private String note;

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public Integer getAwardLevel() {
        return awardLevel;
    }

    public void setAwardLevel(Integer awardLevel) {
        this.awardLevel = awardLevel;
    }

    public Long getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(Long consumeTime) {
        this.consumeTime = consumeTime;
    }

    public Integer getConsumeType() {
        return consumeType;
    }

    public void setConsumeType(Integer consumeType) {
        this.consumeType = consumeType;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public Integer getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Integer consumerId) {
        this.consumerId = consumerId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getActivityUserId() {
        return activityUserId;
    }

    public void setActivityUserId(Integer activityUserId) {
        this.activityUserId = activityUserId;
    }

    public String getActivityUserName() {
        return activityUserName;
    }

    public void setActivityUserName(String activityUserName) {
        this.activityUserName = activityUserName;
    }

    public HdActivityUserInfoVO getActivityUserInfo() {
        return activityUserInfo;
    }

    public void setActivityUserInfo(HdActivityUserInfoVO activityUserInfo) {
        this.activityUserInfo = activityUserInfo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
