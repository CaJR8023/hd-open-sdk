package com.fkw.hdopen.comm;

import org.bouncycastle.util.encoders.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/**
 * @author CAJR
 * @Description RSA 非对称加密
 * @date 2021/9/18 14:32
 */
public class RSAUtils {

    /**
     * RSA最大解密密文大小
     */
    public static final int MAX_DECRYPT_BLOCK = 256;

    /**
     * 加密算法RSA
     */
    public static final String KEY_ALGORITHM = "RSA";

    /**
     * 签名算法
     */
    public static final String SIGNATURE_ALGORITHM = "MD5withRSA";

    public static boolean verify(String publicKey, String data, String sign) throws Exception {
        if (StringUtils.isBlank(publicKey)) {
            return false;
        }
        return verify(Base64.decode(data), getPublicKey(publicKey.getBytes()).getEncoded(), sign);
    }

    public static String decryptByPublicKey(String publicKey, String encryptedData) throws Exception {
        return new String(decryptByPublicKey(Base64.decode(encryptedData), getPublicKey(publicKey.getBytes()).getEncoded()));
    }

    /**
     * 验证签名
     *
     * @param data     已加密数据
     * @param keyBytes 公钥
     * @param sign     签名
     * @return boolean 是否校验通过
     * @author CAJR
     * @date 2021/9/18
     */
    public static boolean verify(byte[] data, byte[] keyBytes, String sign)
            throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, SignatureException {
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        PublicKey publicK = keyFactory.generatePublic(keySpec);
        Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
        signature.initVerify(publicK);
        signature.update(data);
        return signature.verify(Base64.decode(sign));
    }

    public static PublicKey getPublicKey(byte[] bytes) throws Exception {
        bytes = java.util.Base64.getDecoder().decode(bytes);
        X509EncodedKeySpec spec = new X509EncodedKeySpec(bytes);
        KeyFactory factory = KeyFactory.getInstance(KEY_ALGORITHM);
        return factory.generatePublic(spec);
    }

    private static byte[] decryptByPublicKey(byte[] data, byte[] key) throws Exception {
        //取得私钥
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        //密钥材料转换
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(key);
        //产生公钥
        PublicKey pubKey = keyFactory.generatePublic(x509KeySpec);
        //数据解密
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE, pubKey);
        if (data.length >= MAX_DECRYPT_BLOCK) {
            return cipherDoFinal(cipher, data);
        }
        return cipher.doFinal(data);
    }

    private static byte[] cipherDoFinal(Cipher cipher, byte[] srcBytes)
            throws IOException, BadPaddingException, IllegalBlockSizeException {
        if (RSAUtils.MAX_DECRYPT_BLOCK <= 0) {
            throw new RuntimeException("Segment size must be greater than 0");
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int inputLen = srcBytes.length;
        int offSet = 0;
        byte[] cache;
        int i = 0;
        // 对数据分段解密
        while (inputLen - offSet > 0) {
            if (inputLen - offSet > RSAUtils.MAX_DECRYPT_BLOCK) {
                cache = cipher.doFinal(srcBytes, offSet, RSAUtils.MAX_DECRYPT_BLOCK);
            } else {
                cache = cipher.doFinal(srcBytes, offSet, inputLen - offSet);
            }
            out.write(cache, 0, cache.length);
            i++;
            offSet = i * RSAUtils.MAX_DECRYPT_BLOCK;
        }
        byte[] data = out.toByteArray();
        out.close();
        return data;
    }
}
