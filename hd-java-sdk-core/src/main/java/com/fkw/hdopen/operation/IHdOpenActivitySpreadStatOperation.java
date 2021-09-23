package com.fkw.hdopen.operation;

import com.fkw.hdopen.model.HdActivitySpreadStatLevelVO;
import com.fkw.hdopen.model.HdActivityUserSpreadStatVO;
import com.fkw.hdopen.model.Result;

import java.util.List;

/**
 * @author CAJR
 * @Description 互动活动传播数据开放业务接口
 * @date 2021/9/9 17:46
 */
public interface IHdOpenActivitySpreadStatOperation {

    /**
     * 获取活动传播层级的数据
     *
     * @param aid        凡科账号id
     * @param activityId 活动id
     * @return com.fkw.hdopen.model.Result<java.util.List < com.fkw.hdopen.model.HdActivitySpreadStatLevelVO>>
     * @author CAJR
     * @date 2021/9/13
     */
    Result<List<HdActivitySpreadStatLevelVO>> getActivitySpreadStatLevel(int aid, int activityId);

    /**
     * 获取活动用户分析传播数据
     *
     * @param aid        凡科账号id
     * @param activityId 活动id
     * @return com.fkw.hdopen.model.Result<com.fkw.hdopen.model.HdActivityUserSpreadStatVO>
     * @author CAJR
     * @date 2021/9/13
     */
    Result<HdActivityUserSpreadStatVO> getActivityUserSpreadStat(int aid, int activityId);
}
