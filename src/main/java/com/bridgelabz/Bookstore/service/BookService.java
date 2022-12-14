package com.bridgelabz.Bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.Bookstore.Repository.IBookRepository;
import com.bridgelabz.Bookstore.Repository.IUserRepository;
import com.bridgelabz.Bookstore.dto.BookDto;
import com.bridgelabz.Bookstore.model.BookModel;



@Service
public class BookService implements IBookService{
	@Autowired
	IBookRepository bookRepo;
	
	@Autowired 
	IUserRepository userRepo;
	
	@Override
	public BookModel create(BookDto bookDto) {
		BookModel book = new BookModel(bookDto);
		bookRepo.save(book);
		return book;
	}

	@Override
	public List<BookModel> getList() {
		List<BookModel> lst = bookRepo.findAll();
		return lst;
	}

	@Override
	public BookModel update(BookDto bookDto, long id) {
		Optional<BookModel> book = bookRepo.findById(id);
		book.get().setAuthor(bookDto.getAuthor());
		book.get().setDesc(bookDto.getDesc());
		book.get().setLogo(bookDto.getLogo());
		book.get().setName(bookDto.getName());
		book.get().setPrice(bookDto.getPrice());
		book.get().setQuantity(bookDto.getQuantity());
		bookRepo.save(book.get());
		return book.get();
	}

	@Override
	public BookModel delete(long id) {
		Optional<BookModel> book = bookRepo.findById(id);
		bookRepo.delete(book.get());
		return book.get();
	}

	
}
