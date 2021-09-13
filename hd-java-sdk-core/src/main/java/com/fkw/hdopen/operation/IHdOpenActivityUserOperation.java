package com.fkw.hdopen.operation;

import com.fkw.hdopen.model.HdActivityUserVO;
import com.fkw.hdopen.model.PageResult;
import com.fkw.hdopen.model.Result;
import com.fkw.hdopen.model.request.CallHdOpenActivityUsersPageApiVO;
import com.fkw.hdopen.model.request.CallHdActivityUserAchievementApiVO;

/**
 * @author CAJR
 * @Description 互动活动用户(C端用户)数据开放业务接口
 * @date 2021/9/9 17:47
 */
public interface IHdOpenActivityUserOperation {

    /**
     * 更新活动用户的成绩
     *
     * @param vo 活动用户(c端用户)成绩更新VO
     * @return com.fkw.hdopen.model.Result<java.lang.Integer>
     * @author CAJR
     * @date 2021/9/13
     */
    Result<Integer> updateActivityUserAchievement(CallHdActivityUserAchievementApiVO vo);

    /**
     * 根据faiOpenId 获取单个活动用户数据
     *
     * @param aid        凡科账号id
     * @param activityId 活动id
     * @param faiOpenId  faiOpenid
     * @return com.fkw.hdopen.model.Result<com.fkw.hdopen.model.HdActivityUserVO>
     * @author CAJR
     * @date 2021/9/13
     */
    Result<HdActivityUserVO> getOneHdActivityUserByFaiOpenId(int aid, int activityId, String faiOpenId);

    /**
     * 分页获取活动用户名单接口
     *
     * @param vo 请求凡科互动开放分页活动接口条件vo
     * @return com.fkw.hdopen.model.PageResult<com.fkw.hdopen.model.HdActivityUserVO>
     * @author CAJR
     * @date 2021/9/13
     */
    PageResult<HdActivityUserVO> getActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo);

    /**
     * 分页获取活动黑名单接口
     *
     * @param vo 请求凡科互动开放分页活动接口条件vo
     * @return com.fkw.hdopen.model.PageResult<com.fkw.hdopen.model.HdActivityUserVO>
     * @author CAJR
     * @date 2021/9/13
     */
    PageResult<HdActivityUserVO> getBlackActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo);

    /**
     * 分页获取活动获奖用户名单接口
     *
     * @param vo 请求凡科互动开放分页活动接口条件vo
     * @return com.fkw.hdopen.model.PageResult<com.fkw.hdopen.model.HdActivityUserVO>
     * @author CAJR
     * @date 2021/9/13
     */
    PageResult<HdActivityUserVO> getPrizeActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo);

}
