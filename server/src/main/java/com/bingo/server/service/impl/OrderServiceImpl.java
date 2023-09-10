package com.bingo.server.service.impl;

import com.bingo.server.po.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingo.server.mapper.OrderMapper;
import com.bingo.server.service.OrderService;

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
}
