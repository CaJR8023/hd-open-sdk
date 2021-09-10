package com.fkw.hdopen;

import com.fkw.hdopen.comm.JsonUtils;
import com.fkw.hdopen.model.HdOpenActivityVO;
import com.fkw.hdopen.model.Result;
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
        HdPlatformPartnerClient partner = (HdPlatformPartnerClient) new HdPlatformPartnerClientBuilder().build(clientId, clientSecret);
        Result<HdOpenActivityVO> result = partner.getOneHdActivityInfo(9890827, 30);
        System.out.println(JsonUtils.toString(result));
        System.out.println(JsonUtils.toString(partner.getOneHdActivityInfoByPage(9890827, 1, 10)));
    }
}
