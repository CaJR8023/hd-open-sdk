package com.fkw.hdopen.operation;

import com.fkw.hdopen.model.HdActivitySpreadStatLevelVO;
import com.fkw.hdopen.model.HdActivityUserSpreadStatVO;
import com.fkw.hdopen.model.Result;

import java.util.List;

/**
 * 互动活动传播数据开放业务接口
 *
 * @author CAJR
 * @version 1.0.0
 */
public interface IHdOpenActivitySpreadStatOperation {

    /**
     * 获取活动传播层级的数据
     *
     * @param aid        凡科账号id
     * @param activityId 活动id
     * @return com.fkw.hdopen.model.Result
     * @author CAJR
     */
    Result<List<HdActivitySpreadStatLevelVO>> getActivitySpreadStatLevel(int aid, int activityId);

    /**
     * 获取活动用户分析传播数据
     *
     * @param aid        凡科账号id
     * @param activityId 活动id
     * @return com.fkw.hdopen.model.Result
     * @author CAJR
     */
    Result<HdActivityUserSpreadStatVO> getActivityUserSpreadStat(int aid, int activityId);
}
