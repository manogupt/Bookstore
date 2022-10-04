package com.bridgelabz.Bookstore.service;

import com.bridgelabz.Bookstore.dto.CartDto;
import com.bridgelabz.Bookstore.model.CartModel;

public interface ICartService {
	CartModel create(CartDto cartDto);

	CartModel delete(long id);

  CartModel updateCart(Long cartId, CartDto cartDto);

}
