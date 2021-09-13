package com.fkw.hdopen.operation;

import com.fkw.hdopen.model.*;
import com.fkw.hdopen.model.request.CallHdOpenConsumeCodeApiVO;
import com.fkw.hdopen.model.request.CallHdOpenConsumeRecordPageApiVO;

/**
 * @author CAJR
 * @Description 互动核销记录开放业务接口
 * @date 2021/9/9 17:48
 */
public interface IHdOpenConsumeRecordOperation {

    /**
     * 分页获取核销记录
     *
     * @param vo 请求凡科互动开放分页活动接口条件vo
     * @return com.fkw.hdopen.model.PageResult<com.fkw.hdopen.model.HdConsumeRecordVO>
     * @author CAJR
     * @date 2021/9/13
     */
    PageResult<HdConsumeRecordVO> getConsumeRecordByPage(CallHdOpenConsumeRecordPageApiVO vo);

    /**
     * 获取兑奖码的状态记录
     *
     * @param aid  aid
     * @param code 兑奖码
     * @return com.fkw.hdopen.model.Result<com.fkw.hdopen.model.HdCodeStatusVO>
     * @author CAJR
     * @date 2021/9/13
     */
    Result<HdCodeStatusVO> getCodeStatus(int aid, String code);

    /**
     * 核销兑奖码
     *
     * @param vo 核销兑奖码所需参数封装
     * @return com.fkw.hdopen.model.Result<java.lang.Integer>
     * @author CAJR
     * @date 2021/9/13
     */
    Result<Integer> consumeCode(CallHdOpenConsumeCodeApiVO vo);

    /**
     * 查询红包记录
     *
     * @param aid        aid
     * @param activityId 活动id
     * @param cmCode     红包口令码
     * @return com.fkw.hdopen.model.Result<com.fkw.hdopen.model.HdRedPacketVO>
     * @author CAJR
     * @date 2021/9/13
     */
    Result<HdRedPacketVO> getRedPacketRecord(Integer aid, Integer activityId, String cmCode);
}
