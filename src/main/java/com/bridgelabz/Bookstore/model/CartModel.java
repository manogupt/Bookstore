package com.bridgelabz.Bookstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.bridgelabz.Bookstore.dto.CartDto;

import lombok.Data;
@Entity
@Data
public class CartModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@OneToOne
    private UserModel user;
	@OneToOne
    private BookModel book;
	private Integer quantity;
	private Integer totalPrice;
	
	public CartModel(CartDto cartDto) {
		this.quantity = cartDto.getQuantity();
		this.totalPrice=cartDto.getTotalPrice();
		
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public BookModel getBook() {
		return book;
	}

	public void setBook(BookModel book) {
		this.book = book;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public CartModel() {
		super();
	}

	
}
