package com.bingo.server.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bingo.server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.server.constance.Constance;
import com.bingo.server.po.User;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/login")
	public User login(@RequestBody User user) {
		QueryWrapper<User> wrapper = new QueryWrapper<>();
		Map<String, String> map = new HashMap<>();
		map.put("userId", user.getUserId());
		map.put("password", user.getPassword());
		wrapper.allEq(map);
		return userMapper.selectOne(wrapper);
	}
	
	@RequestMapping("/exist")
	public String isExists(@RequestBody User user) {
		String userId = user.getUserId();
		User users = userMapper.selectById(userId);

		if (users != null) {
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

}
