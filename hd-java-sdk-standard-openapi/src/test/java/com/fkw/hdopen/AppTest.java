package com.fkw.hdopen;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException {
//        String clientId = "fk-hd-open-client-169";
//        String clientSecret = "612dba3165fe46eda9f57554f1d99189";
//        ClientConfiguration configuration = new ClientConfiguration();
//        HdStandardPartnerClient standardPartnerClient = new HdStandardPartnerClientBuilder().build(clientId, clientSecret, configuration);
////        System.out.println(standardPartnerClient.getOneHdActivityInfoByPage(28074553, 1, 10));
//        String publicKey = standardPartnerClient.getPublicKey().getData();
//        String sign = "K1/BTKHpjfD3TnImjTOcakS5omCiXRycR7QcoAHnQ/bfTfPdIQL62i1sgpligCUVGdnfOuUzwIuiNCH84m6VnB528kg0XhAkY7QZW7glwjg2tPcvtdHwaqRECVq/B6nNKtulKlv4dZU+GPNWQvmlqK6IwIFl0RQt0gwisJlSorcDDwitmgRTUY0b4U17eMek1PcaddF3AOC/wOA9c3dRlMsvh03zAn9XfF3sF9kgXYkfgSjGt8e5G4ecoI2jSGo0RlL63QcTPfycZir1jTuYn9/JB2c+k82aRzY+qn5AKzdIVzsrcUvrRq4a8dR7UrFxGVo4rtnqakll7gy031JhDA==";
//        String encryptedData = "VfeAtBzmVe8XUoQnR3ucESDJGCab5HNJHgWJxjA1vzujwJ1HxhtmCmHBt/wtNcX2g2vGn08bEChmsH8aDmxxVJbqI9a7muLoClRKUgyY1bV+ZhW3W9N7BFmo1aUnX68NgrZAPlaV2HVuusuhVETLnqgMQHFSBElUXueJkTUfygk9nET2GnrE0+K2NCp8C5hbUG/AxRemAibGzWW9zlxYNzPd9L0O+FDVDiibWdTSOW/39BlbCEW0LRl9hA78HNNFS4Vo3oOGR5f0OgLvrm+pYvZu6MU3h7569J8j1MAiOJ98epY25GvRqkyp6fcahQ756S/dGjQf/ndC/PkekLi0Wg==";
//        System.out.println(standardPartnerClient.decryptByRsaPublicKey(publicKey, sign, encryptedData));
        System.out.println(setFlag(2, 0x2, false));

    }

    public static Integer setFlag(int key, int checkFlag, boolean value) {
        if (value) {
            key |= checkFlag;
        } else {
            key &= ~checkFlag;
        }

        return key;
    }
}
