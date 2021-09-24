package com.fkw.hdopen.operation;

import com.fkw.hdopen.model.*;
import com.fkw.hdopen.model.request.CallHdOpenConsumeCodeApiVO;
import com.fkw.hdopen.model.request.CallHdOpenConsumeRecordPageApiVO;

/**
 * 互动核销记录开放业务接口
 *
 * @author CAJR
 * @version 1.0.0
 */
public interface IHdOpenConsumeRecordOperation {

    /**
     * 分页获取核销记录
     *
     * @param vo 请求凡科互动开放分页活动接口条件vo
     * @return com.fkw.hdopen.model.PageResult
     * @author CAJR
     */
    PageResult<HdConsumeRecordVO> getConsumeRecordByPage(CallHdOpenConsumeRecordPageApiVO vo);

    /**
     * 获取兑奖码的状态记录
     *
     * @param aid  aid
     * @param code 兑奖码
     * @return com.fkw.hdopen.model.Result
     * @author CAJR
     */
    Result<HdCodeStatusVO> getCodeStatus(int aid, String code);

    /**
     * 核销兑奖码
     *
     * @param vo 核销兑奖码所需参数封装
     * @return com.fkw.hdopen.model.Result
     * @author CAJR
     */
    Result<Integer> consumeCode(CallHdOpenConsumeCodeApiVO vo);

    /**
     * 查询红包记录
     *
     * @param aid        aid
     * @param activityId 活动id
     * @param cmCode     红包口令码
     * @return com.fkw.hdopen.model.Result
     * @author CAJR
     */
    Result<HdRedPacketVO> getRedPacketRecord(Integer aid, Integer activityId, String cmCode);
}
