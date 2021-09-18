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
        configuration.setClientAuthCname("openauth-hd.fff.com");
        configuration.setHdResourceCname("open-hd.fff.com");
        configuration.setProtocol(Protocol.HTTP);
        HdPlatformPartnerClient platformPartnerClient = new HdPlatformPartnerClientBuilder()
                .build(clientId, clientSecret, configuration);
    }
}
