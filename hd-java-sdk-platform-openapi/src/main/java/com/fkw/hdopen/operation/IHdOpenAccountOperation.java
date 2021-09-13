package com.fkw.hdopen.operation;

import com.fkw.hdopen.model.HdAccountLoginVO;
import com.fkw.hdopen.model.HdAccountRegisterVO;
import com.fkw.hdopen.model.Result;
import com.fkw.hdopen.model.request.CallHdOpenLoginApiVO;

/**
 * @author CAJR
 * @Description 互动开放账号操作接口类
 * @date 2021/9/13 9:42
 */
public interface IHdOpenAccountOperation {

    Result<HdAccountRegisterVO> register(String partnerId);

    Result<HdAccountRegisterVO> registerOemAcct(String partnerId, Integer agentAid);

    Result<HdAccountLoginVO> login(CallHdOpenLoginApiVO vo);
}
