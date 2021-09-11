package com.fkw.hdopen;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAuth() {
        String clientId = "fk-hd-open-client-21";
        String clientSecret = "ca7db9bc4348ac21975c2e4ca21b8697";
        HdPlatformPartnerClient partner = new HdPlatformPartnerClientBuilder().build(clientId, clientSecret);

        System.out.println(partner.getOneHdActivityInfo(9890827, 30));
        System.out.println(partner.getOneHdActivityInfoByPage(9890827, 1, 10));
    }
}
