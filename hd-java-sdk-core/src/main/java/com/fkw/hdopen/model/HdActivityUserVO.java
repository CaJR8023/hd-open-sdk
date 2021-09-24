package com.fkw.hdopen.model;

import java.util.List;

/**
 * 活动玩家数据VO
 *
 * @author CAJR
 * @version 1.0.0
 */
public class HdActivityUserVO {

    /**
     * C端用户id
     */
    private Integer id;

    /**
     * 凡科账号id
     */
    private Integer aid;

    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * C端用户uid
     */
    private String uid;

    /**
     * C端用户额外信息
     */
    private String extra;

    /**
     * faiOpenId
     */
    private String faiOpenId;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 最佳成绩
     */
    private String achievement;

    /**
     * 最近一次成绩
     */
    private String lastAchievement;

    /**
     * 用户信息
     */
    private HdActivityUserInfoVO info;

    /**
     * 最近一次参与时间
     */
    private Long lastJoinTime;

    /**
     * 第一次参与时间
     */
    private Long firstJoinTime;

    /**
     * 最佳成绩耗时（ps：仅文状元挑战赛，看图答题赢大奖，脑力大挑战,疯狂猜图活动）
     */
    private Double bestCostTime;

    /**
     * 最后一次的成绩耗时（ps：仅文状元挑战赛，看图答题赢大奖，脑力大挑战,疯狂猜图活动）
     */
    private Double lastCostTime;

    /**
     * 该玩家中奖的兑奖码列表
     */
    private List<String> codeList;

    /**
     * 中奖奖项消息列表
     */
    private List<HdActivityUserAwardInfoVO> awardInfo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getFaiOpenId() {
        return faiOpenId;
    }

    public void setFaiOpenId(String faiOpenId) {
        this.faiOpenId = faiOpenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public String getLastAchievement() {
        return lastAchievement;
    }

    public void setLastAchievement(String lastAchievement) {
        this.lastAchievement = lastAchievement;
    }

    public HdActivityUserInfoVO getInfo() {
        return info;
    }

    public void setInfo(HdActivityUserInfoVO info) {
        this.info = info;
    }

    public Long getLastJoinTime() {
        return lastJoinTime;
    }

    public void setLastJoinTime(Long lastJoinTime) {
        this.lastJoinTime = lastJoinTime;
    }

    public Long getFirstJoinTime() {
        return firstJoinTime;
    }

    public void setFirstJoinTime(Long firstJoinTime) {
        this.firstJoinTime = firstJoinTime;
    }

    public Double getBestCostTime() {
        return bestCostTime;
    }

    public void setBestCostTime(Double bestCostTime) {
        this.bestCostTime = bestCostTime;
    }

    public Double getLastCostTime() {
        return lastCostTime;
    }

    public void setLastCostTime(Double lastCostTime) {
        this.lastCostTime = lastCostTime;
    }

    public List<String> getCodeList() {
        return codeList;
    }

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    public List<HdActivityUserAwardInfoVO> getAwardInfo() {
        return awardInfo;
    }

    public void setAwardInfo(List<HdActivityUserAwardInfoVO> awardInfo) {
        this.awardInfo = awardInfo;
    }

    @Override
    public String toString() {
        return "HdActivityUserVO{" +
                "id=" + id +
                ", aid=" + aid +
                ", activityId=" + activityId +
                ", uid='" + uid + '\'' +
                ", extra='" + extra + '\'' +
                ", faiOpenId='" + faiOpenId + '\'' +
                ", name='" + name + '\'' +
                ", achievement='" + achievement + '\'' +
                ", lastAchievement='" + lastAchievement + '\'' +
                ", info=" + info +
                ", lastJoinTime=" + lastJoinTime +
                ", firstJoinTime=" + firstJoinTime +
                ", bestCostTime=" + bestCostTime +
                ", lastCostTime=" + lastCostTime +
                ", codeList=" + codeList +
                ", awardInfo=" + awardInfo +
                '}';
    }
}
