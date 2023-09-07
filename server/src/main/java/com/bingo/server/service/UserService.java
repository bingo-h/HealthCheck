package com.bingo.server.service;

import org.apache.ibatis.annotations.Insert;

import com.bingo.server.po.User;

public interface UserService {

	public User login(User user);
	
	public User getUsers_ByUserId(String userId);
	
	public int register(User user);
}
