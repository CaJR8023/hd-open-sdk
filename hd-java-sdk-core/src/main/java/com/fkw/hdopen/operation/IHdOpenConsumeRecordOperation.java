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

    PageResult<HdConsumeRecordVO> getConsumeRecordByPage(CallHdOpenConsumeRecordPageApiVO vo);

    Result<HdCodeStatusVO> getCodeStatus(int aid, String code);

    Result<Integer> consumeCode(CallHdOpenConsumeCodeApiVO vo);

    Result<HdRedPacketVO> getRedPacketRecord(Integer aid, Integer activityId, String cmCode);
}
