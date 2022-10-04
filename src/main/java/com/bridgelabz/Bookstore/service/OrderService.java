package com.bridgelabz.Bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.Bookstore.Repository.IBookRepository;
import com.bridgelabz.Bookstore.Repository.IOrderRepository;
import com.bridgelabz.Bookstore.Repository.IUserRepository;
import com.bridgelabz.Bookstore.dto.OrderDto;
import com.bridgelabz.Bookstore.model.OrderModel;
import com.bridgelabz.Bookstore.model.UserModel;



@Service
public class OrderService implements IOrderService{
	@Autowired
	IUserRepository userRepo;
	@Autowired 
	IBookRepository bookRepo;
	@Autowired
	IOrderRepository orderRepo;
	
	
	
@Override
	public OrderModel create(OrderDto orderDto) {
		OrderModel newOrder = new OrderModel(orderDto);
				orderRepo.save(newOrder);
				return newOrder;
			}
	
	@Override
	public List<OrderModel> getOrdersForUser(long id) {
		Optional<UserModel> user =userRepo.findById(id);
		List<OrderModel> ordersList = orderRepo.findAllByUser(id);
		return ordersList;
}}
