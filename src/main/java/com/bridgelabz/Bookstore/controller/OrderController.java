package com.bridgelabz.Bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.Bookstore.dto.OrderDto;
import com.bridgelabz.Bookstore.model.OrderModel;
import com.bridgelabz.Bookstore.service.IOrderService;



@RestController
@RequestMapping("/Order")
public class OrderController {
	@Autowired
	IOrderService orderService;
	
	@PostMapping("/create")
	public OrderModel create(@RequestBody OrderDto orderDto) {
		return orderService.create(orderDto);
		
	}
	
	@GetMapping("/getordersforuser/{id}")
	public List<OrderModel> getOrdersForUser(@PathVariable long id){
		return orderService.getOrdersForUser(id);
	}
}
