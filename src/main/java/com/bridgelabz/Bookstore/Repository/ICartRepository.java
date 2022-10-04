package com.bridgelabz.Bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.Bookstore.model.CartModel;



public interface ICartRepository extends JpaRepository<CartModel ,Long>{

}
