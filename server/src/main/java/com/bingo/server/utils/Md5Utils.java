package com.bingo.server.utils;

import org.springframework.util.DigestUtils;

public class Md5Utils {

    public static String getMd5Password(String password, String salt) {
        for (int i = 0; i < 3; i++) {
            password = DigestUtils.md5DigestAsHex((salt + password + salt)
                    .getBytes()).toUpperCase();
        }

        return password;
    }


}
