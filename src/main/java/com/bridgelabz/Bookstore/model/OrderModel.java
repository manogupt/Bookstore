package com.bridgelabz.Bookstore.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

import com.bridgelabz.Bookstore.dto.OrderDto;


@Entity
public class OrderModel {
	public OrderModel(OrderDto orderDto ) {
		this.address=orderDto.getAddress();
		this.price=orderDto.getPrice();
		this.quantity=orderDto.getQuantity();
		
}
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public LocalDate getOrderDate() {
		return OrderDate;
	}


	public void setOrderDate(LocalDate orderDate) {
		OrderDate = orderDate;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getAddress() {
		return address;
	}


	public long getUser() {
		return user;
	}

	public void setUser(long user) {
		this.user = user;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	

	


	public boolean isCancel() {
		return cancel;
	}


	public void setCancel(boolean cancel) {
		this.cancel = cancel;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@CreationTimestamp
	private LocalDate OrderDate;
	private double price;
	private int quantity;
	private String address;
	private  long  user;
	private boolean cancel;
	
	
	public OrderModel() {
		super();
	}}
