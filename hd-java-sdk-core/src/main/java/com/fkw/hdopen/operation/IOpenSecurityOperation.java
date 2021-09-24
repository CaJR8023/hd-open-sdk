package com.fkw.hdopen.operation;

import com.fkw.hdopen.model.Result;

/**
 * 开放安全操作接口类
 *
 * @author CAJR
 * @version 1.0.0
 */
public interface IOpenSecurityOperation {

    /**
     * 获取公钥
     *
     * @return com.fkw.hdopen.model.Result 公钥数据
     * @author CAJR
     */
    Result<String> getPublicKey();

    /**
     * 公钥解密以及验证签名
     *
     * @param publicKey     公钥字符串
     * @param sign          签名
     * @param encryptedData 已加密数据
     * @return java.lang.String 明文
     * @author CAJR
     */
    String decryptByRsaPublicKey(String publicKey, String sign, String encryptedData);
}
