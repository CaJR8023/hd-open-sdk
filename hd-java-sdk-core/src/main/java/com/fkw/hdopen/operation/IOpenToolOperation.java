package com.fkw.hdopen.operation;

import com.fkw.hdopen.model.Result;

/**
 * @author CAJR
 * @Description 互动开放工具操作接口类
 * @date 2021/9/16 10:55
 */
public interface IOpenToolOperation {

    /**
     * 转为长连接
     *
     * @param key 短链接key
     * @return com.fkw.hdopen.model.Result<java.lang.String>
     * @author CAJR
     * @date 2021/9/16
     */
    Result<String> transformLongUrl(String key);

    /**
     * 转为短连接
     *
     * @param url 需要转短链接的url
     * @return com.fkw.hdopen.model.Result<java.lang.String>
     * @author CAJR
     * @date 2021/9/16
     */
    Result<String> transformShortUrl(String url);
}
