package com.fkw.hdopen.operation;

import com.fkw.hdopen.model.HdOpenOrderVO;
import com.fkw.hdopen.model.PageResult;

/**
 * 互动订单开放业务接口
 * @Author HLS 2021/12/24 15:48
 * @Update HLS 2021/12/24 15:48
 */
public interface IHdOpenOrderOperation {
    PageResult<HdOpenOrderVO> getHdOrderInfoList(int aid, int activityId, Integer pageNo, Integer pageSize);
}
