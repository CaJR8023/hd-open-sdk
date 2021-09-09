package com.fkw.hdopen.model;

/**
 * @author CAJR
 * @Description 互动活动VO
 * @date 2021/8/4 11:46
 */
public class HdOpenActivityVO {
    /**
     * 活动id
     */
    private Integer id;
    /**
     * 凡科账号id
     */
    private Integer aid;
    /**
     * 活动名称
     */
    private String name;
    /**
     * 活动用户数量
     */
    private Integer joinUserNum;
    /**
     * 活动用户浏览数
     */
    private Integer view;
    /**
     * 活动链接
     */
    private String activityUrl;
    /**
     * 活动状态名称
     */
    private String statusName;
    /**
     * 活动状态值
     */
    private Integer status;
    /**
     * 活动类型
     */
    private Integer activityType;
    /**
     * 活动类型名称
     */
    private String activityTypeName;
    /**
     * 活动创建时间
     */
    private Long createTime;
    /**
     * 活动开始时间
     */
    private Long startTime;
    /**
     * 活动结束时间
     */
    private Long endTime;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getJoinUserNum() {
        return joinUserNum;
    }

    public void setJoinUserNum(Integer joinUserNum) {
        this.joinUserNum = joinUserNum;
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public String getActivityTypeName() {
        return activityTypeName;
    }

    public void setActivityTypeName(String activityTypeName) {
        this.activityTypeName = activityTypeName;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "HdOpenActivityVO{" +
                "id=" + id +
                ", aid=" + aid +
                ", name='" + name + '\'' +
                ", joinUserNum=" + joinUserNum +
                ", view=" + view +
                ", activityUrl='" + activityUrl + '\'' +
                ", statusName='" + statusName + '\'' +
                ", status=" + status +
                ", activityType=" + activityType +
                ", activityTypeName='" + activityTypeName + '\'' +
                ", createTime=" + createTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
