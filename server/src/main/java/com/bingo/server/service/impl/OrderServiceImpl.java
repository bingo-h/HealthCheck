package com.bingo.server.service.impl;

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
		return orderMapper.getOrdersDoneByUserId(userId);
	}
}
