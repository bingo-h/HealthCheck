package com.bingo.server.controller;

import com.bingo.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.server.constance.Constance;
import com.bingo.server.po.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/login")
	public User login(@RequestBody User user) {
		return userservice.login(user);
	}
	
	@RequestMapping("/exist")
	public String isExists(@RequestBody User user) {
		String userId = user.getUserId();
		User users = userservice.getUsers_ByUserId(userId);
		
		if (users != null) {
			return Constance.ERROR;
		}	
		return Constance.SUCCESS;
	}
	
	@RequestMapping("/register")
	public int register(@RequestBody User user) {
		return userservice.register(user);
	}

	@RequestMapping("/get")
	public User getUsers_ByUserId(@RequestBody User user) {
		return userservice.getUsers_ByUserId(user.getUserId());
	}

}
