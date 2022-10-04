package com.bridgelabz.Bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.Bookstore.dto.BookDto;
import com.bridgelabz.Bookstore.model.BookModel;
import com.bridgelabz.Bookstore.service.IBookService;


@RestController
@RequestMapping("/Book")
public class BookController {
	@Autowired
	IBookService bookService;
	
	@PostMapping("/create")
	public BookModel create(@RequestBody BookDto bookDto) {
		return bookService.create(bookDto);
	}
	@GetMapping("/getist")
	public List<BookModel> getList(){
		return bookService.getList();
	}
	
	@PutMapping("/update/{id}")
	public BookModel update(@RequestBody BookDto bookDto,@PathVariable long id) {
		return bookService.update(bookDto,id);
	}
	
	@DeleteMapping("/delete/{id}")
	public BookModel delete(@PathVariable long id) {
		return bookService.delete(id);
	}
}
