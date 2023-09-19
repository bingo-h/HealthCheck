package com.bingo.server.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.bingo.server.mapper.UserMapper;
import com.bingo.server.po.User;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Date;

public class TokenUtils {

    public static String getToken(String userId, String password) {
        return JWT.create().withAudience(userId) // 将 user id 保存到 token 里面,作为载荷
                .withExpiresAt(new Date(System.currentTimeMillis() + 60*1000*10)) // 10 minutes later token过期
                .sign(Algorithm.HMAC256(password)); // 以 password 作为 token 的密钥
    }

    public static User getCurrentUser(HttpServletRequest request, UserMapper userMapper) {
        try {
            String token = request.getHeader("token");
            if (StringUtils.isNotBlank(token)) {
                String userId = JWT.decode(token).getAudience().get(0);
                return userMapper.selectById(Integer.valueOf(userId));
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

}
