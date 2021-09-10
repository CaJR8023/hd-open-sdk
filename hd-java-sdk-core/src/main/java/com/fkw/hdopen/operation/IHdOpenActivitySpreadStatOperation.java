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

    Result<List<HdActivitySpreadStatLevelVO>> getActivitySpreadStatLevel(int aid, int activityId);

    Result<HdActivityUserSpreadStatVO> getActivityUserSpreadStat(int aid, int activityId);
}
