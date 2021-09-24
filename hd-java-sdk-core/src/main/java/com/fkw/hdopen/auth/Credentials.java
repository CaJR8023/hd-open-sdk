package com.fkw.hdopen.auth;

/**
 * 客户端凭证
 *
 * @author CAJR
 * @version 1.0.0
 */
public interface Credentials {

    String getClientId();

    String getClientSecret();

    String getSecurityToken();

}
