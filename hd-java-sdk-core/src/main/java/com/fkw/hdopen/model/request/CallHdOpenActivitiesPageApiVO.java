package com.fkw.hdopen.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 请求凡科互动开放分页活动接口条件vo
 *
 * @author CAJR
 * @version 1.0.0
 */
public class CallHdOpenActivitiesPageApiVO {

    /**
     * 凡科账号id
     */
    private Integer aid;

    /**
     * 活动id
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer activityType;

    /**
     * 排序字段(正序，只支持数字和时间字段)
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sort;

    /**
     * 页数
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageNo;

    /**
     * 每一页的数量
     */
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
