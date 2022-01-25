package com.fkw.hdopen.operation;

import com.fkw.hdopen.model.HdOpenOrderVO;
import com.fkw.hdopen.model.PageResult;

/**
 * 互动订单开放业务接口
 *
 * @author HLS 2021/12/24 15:48
 * @version 1.0.8
 */
public interface IHdOpenOrderOperation {

    /**
     * 获取订单列表
     *
     * @param aid        凡科id
     * @param activityId 活动id
     * @param pageNo     页码
     * @param pageSize   条目数
     * @return com.fkw.hdopen.model.PageResult
     * @author HLS 2021/12/24 15:48
     */
    PageResult<HdOpenOrderVO> getHdOrderInfoList(int aid, int activityId, Integer pageNo, Integer pageSize);
}
