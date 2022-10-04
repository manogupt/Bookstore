package com.bridgelabz.Bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.Bookstore.dto.CartDto;
import com.bridgelabz.Bookstore.model.CartModel;
import com.bridgelabz.Bookstore.service.ICartService;


@RestController
@RequestMapping("/cart")
public class CartController {
@Autowired
	
	ICartService cartService;
	
	@PostMapping("/create")
	public CartModel create(@RequestBody CartDto cartDto) {
		return cartService.create(cartDto);
	}
	
	@PutMapping("/updatecart")
	public CartModel updateCare(@PathVariable Long cartId,@RequestBody CartDto cartDto) {
		return cartService.updateCart(cartId,cartDto);
	}
	@DeleteMapping("/delete/{cartId}")
	public CartModel delete(@PathVariable long id){
		return cartService.delete(id);
	}
}
