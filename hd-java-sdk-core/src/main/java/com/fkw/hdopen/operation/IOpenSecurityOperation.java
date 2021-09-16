package com.fkw.hdopen.operation;

import com.fkw.hdopen.model.Result;

/**
 * @author CAJR
 * @Description 开放安全操作接口类
 * @date 2021/9/16 10:43
 */
public interface IOpenSecurityOperation {

    Result<String> getPublicKey();
}
