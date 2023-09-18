package com.bingo.server.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.bingo.server.Utils.Md5Utils;
import com.bingo.server.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.server.constance.Constance;
import com.bingo.server.po.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/login")
    public User login(@RequestBody User user) {
//        QueryWrapper<User> wrappertest = new QueryWrapper<>();
//        List<User> users = userMapper.selectList(wrappertest);
//
//        for (User user_each :
//                users) {
//            String salt = UUID.randomUUID().toString().toUpperCase();
//            user_each.setSalt(salt);
//            user_each.setPassword(Md5Utils.getMd5Password(user_each.getPassword(), salt));
//            userMapper.updateById(user_each);
//        }
//
//        return null;

		String userId = user.getUserId();

		Map<String, String> map = new HashMap<>();
		map.put("userId", userId);
		map.put("password", Md5Utils.getMd5Password(user.getPassword(),
				userMapper.selectById(userId).getSalt()));

		QueryWrapper<User> wrapper = new QueryWrapper<>();
		wrapper.allEq(map);
		return userMapper.selectOne(wrapper);
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
            return Constance.ERROR;
        }

        return Constance.SUCCESS;
    }
}
