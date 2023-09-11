package com.bingo.server.controller;

import com.bingo.server.po.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.server.po.User;
import com.bingo.server.service.OrderService;

import java.util.List;

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

	@RequestMapping("/save")
	public int saveOrder(@RequestBody Order order) {
		System.out.println(order.getOrderId());
		return orderService.saveOrder(order);
	}

	@RequestMapping("/getall")
	public List<Order> getOrdersByUserId(@RequestBody Order order) {
		return orderService.getOrdersByUserId(order.getUserId());
	}

	@RequestMapping("/del")
	public int delOrderById(@RequestBody Order order) {
		return orderService.delOrderById(order.getOrderId());
	}
}
