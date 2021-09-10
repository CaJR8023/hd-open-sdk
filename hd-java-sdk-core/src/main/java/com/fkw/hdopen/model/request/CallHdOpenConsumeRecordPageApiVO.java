package com.fkw.hdopen.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author 请求凡科互动开放分页活动接口条件vo
 * @Description
 * @date 2021/9/10 10:49
 */
public class CallHdOpenConsumeRecordPageApiVO {

    private Integer aid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer activityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageNo;

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
