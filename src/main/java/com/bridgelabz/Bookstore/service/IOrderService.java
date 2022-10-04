package com.bridgelabz.Bookstore.service;

import java.util.List;

import com.bridgelabz.Bookstore.dto.OrderDto;
import com.bridgelabz.Bookstore.model.OrderModel;

public interface IOrderService {

	List<OrderModel> getOrdersForUser(long id);

	OrderModel create(OrderDto orderDto);

}
