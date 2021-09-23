package com.fkw.hdopen.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author 请求凡科互动开放分页活动接口条件vo
 * @Description
 * @date 2021/9/10 10:49
 */
public class CallHdOpenConsumeRecordPageApiVO {

    /**
     * 凡科账号id
     */
    private Integer aid;

    /**
     * 活动id
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer activityId;

    /**
     * 开始时间
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long startTime;

    /**
     * 结束时间
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long endTime;

    /**
     * 页数
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageNo;

    /**
     * 每一页数量
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageSize;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
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

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "CallHdOpenConsumeRecordPageApiVO{" +
                "aid=" + aid +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", activityId=" + activityId +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                '}';
    }
}
