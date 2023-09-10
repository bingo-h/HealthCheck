package com.bingo.server.service;

import com.bingo.server.po.Order;

public interface OrderService {
	int getOrdersDoneByUserId(String userId);

	int saveOrder(Order order);
}
