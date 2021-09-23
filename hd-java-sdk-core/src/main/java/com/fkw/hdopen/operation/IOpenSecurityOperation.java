package com.fkw.hdopen.operation;

import com.fkw.hdopen.model.Result;

/**
 * @author CAJR
 * @Description 开放安全操作接口类
 * @date 2021/9/16 10:43
 */
public interface IOpenSecurityOperation {

    /**
     * 获取公钥
     *
     * @return com.fkw.hdopen.model.Result<java.lang.String> 公钥数据
     * @author CAJR
     * @date 2021/9/18
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
     * @date 2021/9/18
     */
    String decryptByRsaPublicKey(String publicKey, String sign, String encryptedData);
}
