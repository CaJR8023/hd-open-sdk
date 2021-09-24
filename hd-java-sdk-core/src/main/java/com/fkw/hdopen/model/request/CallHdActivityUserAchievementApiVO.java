package com.fkw.hdopen.model.request;

/**
 * 活动用户(c端用户)成绩更新VO
 *
 * @author CAJR
 * @version 1.0.0
 */
public class CallHdActivityUserAchievementApiVO {

    /**
     * aid
     */
    private Integer aid;
    /**
     * 活动id
     */
    private Integer activityId;
    /**
     * 活动用户(c端用户)id
     */
    private Integer activityUserId;
    /**
     * 成绩
     */
    private String achievement;

    public Integer getAid() {
        return aid;
    }

    public CallHdActivityUserAchievementApiVO setAid(Integer aid) {
        this.aid = aid;
        return this;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public CallHdActivityUserAchievementApiVO setActivityId(Integer activityId) {
        this.activityId = activityId;
        return this;
    }

    public Integer getActivityUserId() {
        return activityUserId;
    }

    public CallHdActivityUserAchievementApiVO setActivityUserId(Integer activityUserId) {
        this.activityUserId = activityUserId;
        return this;
    }

    public String getAchievement() {
        return achievement;
    }

    public CallHdActivityUserAchievementApiVO setAchievement(String achievement) {
        this.achievement = achievement;
        return this;
    }

    @Override
    public String toString() {
        return "HdActivityUserAchievementVO{" +
                "aid=" + aid +
                ", activityId=" + activityId +
                ", activityUserId=" + activityUserId +
                ", achievement='" + achievement + '\'' +
                '}';
    }
}
