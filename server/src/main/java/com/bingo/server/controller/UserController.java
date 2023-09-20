package com.bingo.server.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bingo.server.utils.Md5Utils;
import com.bingo.server.mapper.UserMapper;
import com.bingo.server.utils.TokenUtils;
import com.bingo.server.utils.VerificationCode;
import jakarta.annotation.Resource;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;

import com.bingo.server.constance.Constance;
import com.bingo.server.po.User;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.*;

import static com.bingo.server.utils.TokenUtils.getToken;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    private String verifyCode;

    @RequestMapping("/login")
    public Map<String, Object> login(@RequestBody User user) {
        /*QueryWrapper<User> wrappertest = new QueryWrapper<>();
        List<User> users = userMapper.selectList(wrappertest);

        for (User user_each :
                users) {
            String salt = UUID.randomUUID().toString().toUpperCase();
            user_each.setSalt(salt);
            user_each.setPassword(Md5Utils.getMd5Password(user_each.getPassword(), salt));
            userMapper.updateById(user_each);
        }

        return null;*/

        Map<String, Object> map = new HashMap<>();
        String userId = user.getUserId();

        Map<String, String> wrapper_map = new HashMap<>();
        wrapper_map.put("userId", userId);
        wrapper_map.put("password", Md5Utils.getMd5Password(user.getPassword(),
                userMapper.selectById(userId).getSalt()));

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.allEq(wrapper_map);

        User user_result = userMapper.selectOne(wrapper);
        map.put("user", user_result);
        map.put("token", getToken(user_result.getUserId(), user_result.getPassword()));
        return map;
    }

    @RequestMapping("/checktoken")
    public int checkToken(HttpServletRequest request) {
        System.out.println(TokenUtils.getCurrentUser(request, userMapper));
        return 1;
    }

    @RequestMapping("/exist")
    public String isExists(@RequestBody User user) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("userId", user.getUserId());
        List<User> users = userMapper.selectList(wrapper);

        if (!users.isEmpty()) {
            return Constance.ERROR;
        }

        return Constance.SUCCESS;
    }

    @RequestMapping("/register")
    public int register(@RequestBody User user) {
        String salt = UUID.randomUUID().toString().toUpperCase();
        user.setSalt(salt);
        user.setPassword(Md5Utils.getMd5Password(user.getPassword(), salt));

        return userMapper.insert(user);
    }

    @RequestMapping("/reset")
    public int reset(@RequestBody User user) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("identityCard", user.getIdentityCard());
        User ExistUser = userMapper.selectOne(wrapper);

        if (ExistUser == null) return 0;
        else if (ExistUser.getPassword().equalsIgnoreCase(user.getPassword())) {
            return -1;
        }

        return userMapper.update(user, wrapper);
    }

    @RequestMapping("/get")
    public User getUsers_ByUserId(@RequestBody User user) {
        return userMapper.selectById(user.getUserId());
    }

    @RequestMapping("/exist_cid")
    public String isExistCid(@RequestBody User user) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("identityCard", user.getIdentityCard());
        List<User> users = userMapper.selectList(wrapper);

        if (!users.isEmpty()) {
            System.out.println("error");
            return Constance.ERROR;
        }

        return Constance.SUCCESS;
    }

    @RequestMapping("/verifycode")
    public void getVerifyCode(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        VerificationCode code = new VerificationCode();
        BufferedImage image = code.getImage();
        verifyCode = code.getText();
        VerificationCode.output(image, resp.getOutputStream());
    }

    @RequestMapping("/verify")
    public boolean Verify(@RequestBody String code) {
        code = code.substring(0, code.length() - 1);
        return code.equalsIgnoreCase(this.verifyCode);
    }
}
