package com.bridgelabz.Bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.Bookstore.Repository.IBookRepository;
import com.bridgelabz.Bookstore.Repository.ICartRepository;
import com.bridgelabz.Bookstore.Repository.IUserRepository;
import com.bridgelabz.Bookstore.dto.CartDto;
import com.bridgelabz.Bookstore.model.BookModel;
import com.bridgelabz.Bookstore.model.CartModel;
import com.bridgelabz.Bookstore.model.UserModel;


@Service
public class CartService implements ICartService{
	@Autowired
	ICartRepository cartRepo;
	
	@Autowired
	IUserRepository userRepo;
	@Autowired
	IBookRepository bookRepo;

	@Override
	public CartModel create(CartDto cartDto) {
		CartModel newCart = new CartModel(cartDto);
				cartRepo.save(newCart);
			return newCart;
			}
		
	@Override
	public CartModel delete(long id) {
		Optional<CartModel> cart = cartRepo.findById(id);
		cartRepo.delete(cart.get());
		return cart.get();
	}

	@Override
	public CartModel updateCart(Long id, CartDto cartDto) {
		Optional<CartModel> cart = cartRepo.findById(id);
		
		
			
				cart.get().setQuantity(cartDto.getQuantity());
				
				cartRepo.save(cart.get());
				
				return cart.get();
			}

		
		}

