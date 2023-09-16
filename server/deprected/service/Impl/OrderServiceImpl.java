package com.bingo.server.service.impl;

import com.bingo.server.po.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingo.server.mapper.OrderMapper;
import com.bingo.server.service.OrderService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public int getOrdersDoneByUserId(String userId) {
		Integer number = orderMapper.getOrdersDoneByUserId(userId);
		if (number == null) number = 0;
		return number;
	}

	@Override
	public int saveOrder(Order order) {
		Integer number = orderMapper.saveOrder(order);
		if (number == null) number = 0;
		return number;
	}

	@Override
	public List<Order> getOrdersByUserId(String userId) {
		return orderMapper.getOrdersByUserId(userId);
	}

	@Override
	public int delOrderById(Integer orderId) {
		Integer number = orderMapper.delOrderById(orderId);
		if (number == null) number = 0;
		return number;
	}
}
