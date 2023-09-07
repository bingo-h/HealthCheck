package com.bingo.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingo.server.mapper.UserMapper;
import com.bingo.server.po.User;
import com.bingo.server.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userMapper.getUsers_ByUserId_ByPassword(user);
	}

	@Override
	public User getUsers_ByUserId(String userId) {
		return userMapper.getUsers_ByUserId(userId);
	}
	
	@Override
	public int register(User user) {
		return userMapper.saveUser(user);
	}
}
