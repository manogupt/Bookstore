package com.bridgelabz.Bookstore.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.Bookstore.model.UserModel;



public interface IUserRepository extends JpaRepository<UserModel, Long>{

	Optional<UserModel> findByEmail(String mail); 


}