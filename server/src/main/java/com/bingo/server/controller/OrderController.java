package com.bingo.server.controller;

import com.bingo.server.mapper.OrderMapper;
import com.bingo.server.po.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.server.po.User;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderMapper orderMapper;
	
	@RequestMapping("/done")
	public int getOrdersDoneByUserId(@RequestBody User user) {
		Integer number = orderMapper.getOrdersDoneByUserId(user.getUserId());
		if (number == null) number = 0;
		return number;
	}

	@RequestMapping("/save")
	public int saveOrder(@RequestBody Order order) {
		Integer number = orderMapper.saveOrder(order);
		if (number == null) number = 0;
		return number;
	}

	@RequestMapping("/getall")
	public List<Order> getOrdersByUserId(@RequestBody Order order) {
		return orderMapper.getOrdersByUserId(order.getUserId());
	}

	@RequestMapping("/del")
	public int delOrderById(@RequestBody Order order) {
		Integer number = orderMapper.delOrderById(order.getOrderId());
		if (number == null) number = 0;
		return number;
	}
}
