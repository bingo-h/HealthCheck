package com.bingo.server.Utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Random;

public class AesUtils {

    private static final Base64.Encoder encoder = Base64.getEncoder();

    public static final Base64.Decoder decoder = Base64.getDecoder();

    public static String encrypt(String content, String keyStr) {

        byte[] key = keyStr.getBytes();

        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");

        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] bytes_content = content.getBytes(StandardCharsets.UTF_8);
            byte[] encode_content = cipher.doFinal(bytes_content);
            return encoder.encodeToString(encode_content);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String decrypt(String content, String keyStr) {
        byte[] key = keyStr.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");

        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte[] encode_content = decoder.decode(content);
            byte[] byte_content = cipher.doFinal(encode_content);
            return new String(byte_content, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getKey(){
        String chars = "ABCDEFGHJKMNPQRSTWXYZabcdefhijkmnprstwxyz1234567890";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            builder.append(chars.indexOf(new Random().nextInt(chars.length())));
        }
        return builder.toString();
    }
}
