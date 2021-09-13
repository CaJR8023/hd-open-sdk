package com.fkw.hdopen.operation;

import com.fkw.hdopen.model.HdOpenActivityVO;
import com.fkw.hdopen.model.PageResult;
import com.fkw.hdopen.model.Result;
import com.fkw.hdopen.model.request.CallHdOpenActivitiesPageApiVO;

/**
 * @author CAJR
 * @Description 互动活动开放业务接口
 * @date 2021/9/9 16:28
 */
public interface IHdOpenActivityOperation {

    /**
     * 获取单个活动信息
     *
     * @param aid        凡科账号aid
     * @param activityId 活动id
     * @return com.fkw.hdopen.model.Result<com.fkw.hdopen.model.HdOpenActivityVO>
     * @author CAJR
     * @date 2021/9/13
     */
    Result<HdOpenActivityVO> getOneHdActivityInfo(int aid, int activityId);

    /**
     * 分页获取活动列表
     *
     * @param aid      凡科账号aid
     * @param pageNo   第几页
     * @param pageSize 每页的数量
     * @return com.fkw.hdopen.model.PageResult<com.fkw.hdopen.model.HdOpenActivityVO>
     * @author CAJR
     * @date 2021/9/13
     */
    PageResult<HdOpenActivityVO> getHdActivityInfoByPage(int aid, Integer pageNo, Integer pageSize);

    /**
     * 分页获取活动列表
     *
     * @param vo 请求凡科互动开放分页活动接口条件vo
     * @return com.fkw.hdopen.model.PageResult<com.fkw.hdopen.model.HdOpenActivityVO> 互动活动VO
     * @author CAJR
     * @date 2021/9/13
     */
    PageResult<HdOpenActivityVO> getHdActivityInfoByPage(CallHdOpenActivitiesPageApiVO vo);
}
