package com.bingo.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.server.po.User;
import com.bingo.server.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/done")
	public int getOrdersDoneByUserId(@RequestBody User user) {
		String userId = user.getUserId();
		return orderService.getOrdersDoneByUserId(userId);
	}
}
