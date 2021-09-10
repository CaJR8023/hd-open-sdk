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

    Result<Integer> updateActivityUserAchievement(CallHdActivityUserAchievementApiVO vo);

    Result<HdActivityUserVO> getOneHdActivityUserByFaiOpenId(int aid, int activityId, String faiOpenId);

    PageResult<HdActivityUserVO> getActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo);

    PageResult<HdActivityUserVO> getBlackActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo);

    PageResult<HdActivityUserVO> getPrizeActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo);

}
