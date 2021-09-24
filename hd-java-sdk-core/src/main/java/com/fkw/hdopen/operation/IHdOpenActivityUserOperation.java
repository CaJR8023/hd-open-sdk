package com.fkw.hdopen.operation;

import com.fkw.hdopen.model.HdActivityUserVO;
import com.fkw.hdopen.model.PageResult;
import com.fkw.hdopen.model.Result;
import com.fkw.hdopen.model.request.CallHdOpenActivityUsersPageApiVO;
import com.fkw.hdopen.model.request.CallHdActivityUserAchievementApiVO;

/**
 * 互动活动用户(C端用户)数据开放业务接口
 *
 * @author CAJR
 * @version 1.0.0
 */
public interface IHdOpenActivityUserOperation {

    /**
     * 更新活动用户的成绩
     *
     * @param vo 活动用户(c端用户)成绩更新VO
     * @return com.fkw.hdopen.model.Result
     * @author CAJR
     */
    Result<Integer> updateActivityUserAchievement(CallHdActivityUserAchievementApiVO vo);

    /**
     * 根据faiOpenId 获取单个活动用户数据
     *
     * @param aid        凡科账号id
     * @param activityId 活动id
     * @param faiOpenId  faiOpenid
     * @return com.fkw.hdopen.model.Result
     * @author CAJR
     */
    Result<HdActivityUserVO> getOneHdActivityUserByFaiOpenId(int aid, int activityId, String faiOpenId);

    /**
     * 分页获取活动用户名单接口
     *
     * @param vo 请求凡科互动开放分页活动接口条件vo
     * @return com.fkw.hdopen.model.PageResult
     * @author CAJR
     */
    PageResult<HdActivityUserVO> getActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo);

    /**
     * 分页获取活动黑名单接口
     *
     * @param vo 请求凡科互动开放分页活动接口条件vo
     * @return com.fkw.hdopen.model.PageResult
     * @author CAJR
     */
    PageResult<HdActivityUserVO> getBlackActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo);

    /**
     * 分页获取活动获奖用户名单接口
     *
     * @param vo 请求凡科互动开放分页活动接口条件vo
     * @return com.fkw.hdopen.model.PageResult
     * @author CAJR
     */
    PageResult<HdActivityUserVO> getPrizeActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo);

}
