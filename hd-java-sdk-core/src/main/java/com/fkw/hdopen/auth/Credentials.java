package com.fkw.hdopen.auth;

/**
 * @author CAJR
 * @Description 客户端凭证
 * @date 2021/7/26 11:27
 */
public interface Credentials {

    String getClientId();

    String getClientSecret();

    String getSecurityToken();

    boolean useSecurityToken();

}
