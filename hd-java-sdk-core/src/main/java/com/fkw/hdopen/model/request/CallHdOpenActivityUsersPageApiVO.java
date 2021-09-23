package com.fkw.hdopen.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author CAJR
 * @Description 请求凡科互动开放分页活动接口条件vo
 * @date 2021/9/10 17:20
 */
public class CallHdOpenActivityUsersPageApiVO {

    /**
     * 凡科账号id
     */
    private Integer aid;

    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * 奖项等级
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer level;

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

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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

}
