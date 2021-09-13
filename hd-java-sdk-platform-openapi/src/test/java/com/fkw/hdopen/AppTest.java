package com.fkw.hdopen;

import com.fkw.hdopen.comm.Protocol;
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
        ClientConfiguration configuration = new ClientConfiguration();
        configuration.setClientAuthCname("172.17.8.21:51940");
        configuration.setHdResourceCname("172.17.8.21:51941");
        configuration.setProtocol(Protocol.HTTP);
        HdPlatformPartnerClient partner = new HdPlatformPartnerClientBuilder()
                .build(clientId, clientSecret, configuration);

        System.out.println(partner.getOneHdActivityInfo(9890827, 30));
        System.out.println(partner.getOneHdActivityInfoByPage(9890827, 1, 10));
    }
}
