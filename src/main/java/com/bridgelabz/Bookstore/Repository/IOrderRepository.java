package com.bridgelabz.Bookstore.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.Bookstore.model.OrderModel;



public interface IOrderRepository extends JpaRepository<OrderModel,Long>{

	List<OrderModel> findAllByUser(long id);

}
