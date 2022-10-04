package com.bridgelabz.Bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.Bookstore.model.BookModel;



public interface IBookRepository extends JpaRepository<BookModel,Long>{

}
