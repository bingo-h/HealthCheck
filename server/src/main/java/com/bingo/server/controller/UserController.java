package com.bingo.server.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bingo.server.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.server.constance.Constance;
import com.bingo.server.po.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserMapper userMapper;
	
	@RequestMapping("/login")
	public User login(@RequestBody User user, @RequestBody String key) {


		Map<String, String> map = new HashMap<>();
		map.put("userId", user.getUserId());
		map.put("password", user.getPassword());

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
		return userMapper.insert(user);
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
