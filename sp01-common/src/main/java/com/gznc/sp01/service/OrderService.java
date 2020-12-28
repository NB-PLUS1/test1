package com.gznc.sp01.service;

import com.gznc.sp01.pojo.Order;

public interface OrderService {
	Order getOrder(String orderId);
	void addOrder(Order order);


}
