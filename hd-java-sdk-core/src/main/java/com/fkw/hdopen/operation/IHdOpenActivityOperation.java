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

    Result<HdOpenActivityVO> getOneHdActivityInfo(int aid, int activityId);

    PageResult<HdOpenActivityVO> getOneHdActivityInfoByPage(int aid, Integer pageNo, Integer pageSize);

    PageResult<HdOpenActivityVO> getOneHdActivityInfoByPage(CallHdOpenActivitiesPageApiVO vo);
}
