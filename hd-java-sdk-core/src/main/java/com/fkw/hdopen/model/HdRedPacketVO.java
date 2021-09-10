package com.fkw.hdopen.model;

/**
 * @author CAJR
 * @Description 红包记录VO
 * @date 2021/9/10 17:58
 */
public class HdRedPacketVO {
    /**凡科账号id */
    private Integer aid;

    /**活动id */
    private Integer activityId;

    /** 奖品名称*/
    private String awardName;

    /**活动id */
    private String activityName;

    /**凡科公众号openId */
    private String faiOpenId;

    /**兑奖码 */
    private String code;

    /**奖品等级 */
    private String level;

    /**红包金额（单位：分） */
    private Integer money;

    /**活动用户id */
    private Integer activityUserId;

    /**活动用户信息 */
    private HdActivityUserInfoVO activityUserInfo;

    /** 派发红包返回码*/
    private String resultCode;

    /**备注 */
    private String note;

    /** 红包状态*/
    private Integer status;

    /**创建时间 */
    private Long createTime;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getFaiOpenId() {
        return faiOpenId;
    }

    public void setFaiOpenId(String faiOpenId) {
        this.faiOpenId = faiOpenId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getActivityUserId() {
        return activityUserId;
    }

    public void setActivityUserId(Integer activityUserId) {
        this.activityUserId = activityUserId;
    }

    public HdActivityUserInfoVO getActivityUserInfo() {
        return activityUserInfo;
    }

    public void setActivityUserInfo(HdActivityUserInfoVO activityUserInfo) {
        this.activityUserInfo = activityUserInfo;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
