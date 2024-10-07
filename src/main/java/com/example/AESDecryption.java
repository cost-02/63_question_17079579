package com.example;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class AESDecryption {
    public static String decrypt(byte[] cipherText, String keyString) throws Exception {
        // Assicurati che la chiave sia della lunghezza corretta (es. 16, 24, 32 byte per AES)
        byte[] key = keyString.getBytes("UTF-8");
        Key aesKey = new SecretKeySpec(key, "AES");

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, aesKey);
        byte[] decrypted = cipher.doFinal(cipherText);

        return new String(decrypted);
    }
}
