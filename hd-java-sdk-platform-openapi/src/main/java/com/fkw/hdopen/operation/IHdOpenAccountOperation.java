package com.fkw.hdopen.operation;

import com.fkw.hdopen.model.HdAccountLoginVO;
import com.fkw.hdopen.model.HdAccountRegisterVO;
import com.fkw.hdopen.model.Result;
import com.fkw.hdopen.model.request.CallHdOemAcctBindApiVO;
import com.fkw.hdopen.model.request.CallHdOpenLoginApiVO;

/**
 * 互动开放账号操作接口类
 *
 * @author CAJR
 * @version 1.0.0
 */
public interface IHdOpenAccountOperation {

    /**
     * 凡科互动B端账号注册
     *
     * @param partnerId 关联合作方B端账号 ID
     * @return com.fkw.hdopen.model.Result
     * @author CAJR
     */
    Result<HdAccountRegisterVO> register(String partnerId);

    /**
     * 凡科互动B端账号注册(分销商平台合作方接入使用)
     *
     * @param partnerId 关联合作方B端账号 ID
     * @param agentAid  关联凡科互动分销账号ID
     * @return com.fkw.hdopen.model.Result
     * @author CAJR
     */
    Result<HdAccountRegisterVO> registerOemAcct(String partnerId, Integer agentAid);

    /**
     * 凡科互动B端账号登录
     *
     * @param vo 登录参数
     * @return com.fkw.hdopen.model.Result
     * @author CAJR
     */
    Result<HdAccountLoginVO> login(CallHdOpenLoginApiVO vo);

    /**
     * 分销商注册客户账号绑定开放平台
     *
     * @param vo 调用参数
     * @return com.fkw.hdopen.model.Result
     * @author CAJR
     */
    Result<Integer> oemAcctBind(CallHdOemAcctBindApiVO vo);
}
