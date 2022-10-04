package com.bridgelabz.Bookstore.service;

import java.util.List;

import com.bridgelabz.Bookstore.dto.BookDto;
import com.bridgelabz.Bookstore.model.BookModel;

public interface IBookService {
	BookModel create(BookDto bookDto);

	List<BookModel> getList();

	BookModel update(BookDto bookDto, long id);

	BookModel delete(long id);

}
