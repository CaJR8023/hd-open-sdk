package com.fkw.hdopen;

import com.fkw.hdopen.comm.Protocol;
import com.fkw.hdopen.comm.RSAUtils;
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

    }

    @Test
    public void testRsa() throws Exception {
        String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmURDQPiCrkHtwVR5RdGSSjNUFra1AS14k/3x0H+Ztnr8IIfmqE3vHC3GG/IZcDtX+UBWKJTHPyNtQfCkLdK3xxDzIXttpeij5qmkMEK/X+br03KXhQXu3RjyRDVuYe/Ao8QjvQ9235552BAuQqllCYcunIVvtfiOAS4v/lsVN4QfOYz4oIZTXOX1l5P+bYdzPu1GPJZDt73qaZPXTcAMIRCa1rM2KNDICwmwpIcOpPlZ4KB0qLrSsmg7NDhEgS27YSsQ0w+dmRDwIjsa8DbNP+iiK395i/aX9C8cJ2qZBNFyym0SNg3G3eGNx6UkJsSdGP7Ff7py7m8pMG4UIDPxSwIDAQAB";
        String sign = "CFCLWZsCZZZ8I5+SeYMtR5mmbXn7feA4gKiPP79RjCXLunANGFASPzcQhIVDbVCz3NwLWFL0YZgKN8cRjSD9PAdiuxs6c+/6YA4ZBr82b4jROrGz/flT9UcJwfRPrBMvmLZh7E56+v6qjJbqJvmF7KiMGIpZjg5MWzx2fDCGTuP0BGzFJmuwHTEFFNiN8ifagFJyZPSL3Q1FVXwJU1wWkDb1vI6jvkC9OqchKK2HckT9cGbjgDnJGYhMzeeoJRUd/nFdzcnHvPut/EEvujrfZad9vCSlcpBUNUfEZYPsCqtxLEkqpvnk25z+reifoNyzq004aiZRHQko88MtD9tq2w==";
        String encryptedData = "eYQdSP7mVIeTBMEvYBuckigFKL6RyZeBI2buIedKCPLpaxHFpj5i6Tttd/nn1P2Gz/Hjc94nFJ4p22A9z9pPU3bn6xG3NUiRhP8vIC3BEhcuG5s8voHwN6GhLXQk1AmrdZVDS9JieHxA56FNwTMxovErz7jFCCm6sdx74NIuu5CcoIZ1jNUb4YC98uS8bnuql+AkY+9a1IFpd5xhWroT+bk+vc5rJLZ2IOcYLQYvxZQ2M//Bl8HaN95g6dD7U/VxoKqlwQRSS4+uC79JoRCmcsb1ai1uZ151zPYutqYR6nEv6Jme81e/8nRCgk/i5kC0G/IqYgDtktKRaRwVBqc+5w==";
        System.out.println(RSAUtils.verify(publicKey, encryptedData, sign));
        System.out.println(RSAUtils.decryptByPublicKey(publicKey, encryptedData));

    }

    @Test
    public void testHls(){
        /*String clientId = "fk-hd-open-client-625";
        String clientSecret = "a4f87fafa9a6471e85963544f2822e22";
        ClientConfiguration configuration = new ClientConfiguration();
        configuration.setClientAuthCname("openauth-hd.fff.com");
        configuration.setHdResourceCname("open-hd.fff.com");
        configuration.setProtocol(Protocol.HTTP);
        HdPlatformPartnerClient partner = new HdPlatformPartnerClientBuilder()
                .build(clientId, clientSecret, configuration);

        System.out.println(partner.getHdOrderInfoList(9895915, 25, 1, 20));*/
    }
}
