package com.bingo.server.service;


import com.bingo.server.po.User;

public interface UserService {

	User login(User user);
	
	User getUsers_ByUserId(String userId);
	
	int register(User user);
}
