package com.fkw.hdopen.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author 请求凡科互动开放分页活动接口条件vo
 * @Description
 * @date 2021/9/10 10:49
 */
public class CallHdOpenActivitiesPageApiVO {

    private Integer aid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer activityType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageSize;

    public Integer getAid() {
        return aid;
    }

    public CallHdOpenActivitiesPageApiVO setAid(Integer aid) {
        this.aid = aid;
        return this;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public CallHdOpenActivitiesPageApiVO setActivityType(Integer activityType) {
        this.activityType = activityType;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public CallHdOpenActivitiesPageApiVO setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public CallHdOpenActivitiesPageApiVO setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public CallHdOpenActivitiesPageApiVO setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public String toString() {
        return "CallHdOpenActivitiesPageApiVO{" +
                "aid=" + aid +
                ", activityType=" + activityType +
                ", sort='" + sort + '\'' +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                '}';
    }
}
