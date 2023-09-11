package com.bingo.server.service;

import com.bingo.server.po.Order;

import java.util.List;

public interface OrderService {
	int getOrdersDoneByUserId(String userId);

	int saveOrder(Order order);

	List<Order> getOrdersByUserId(Integer userId);

    int delOrderById(Integer orderId);
}
