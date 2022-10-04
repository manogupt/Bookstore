package com.bridgelabz.Bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.bridgelabz.Bookstore.dto.BookDto;

import lombok.Data;


@Entity
@Data
public class BookModel {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookId;
    @Column(name="bookname") 
	private String name;
    @Column(name="bookauthor") 
	private String author;
    @Column(name="bookdesc") 
	private String desc;
    @Column(name="bookogo") 
	private String logo;
    @Column(name="bookprice") 
	private Integer price;
    @Column(name="bookquantity") 
	private int quantity;
	
	public BookModel(BookDto bookDto) {
	
		this.name=bookDto.getName();
		this.author=bookDto.getAuthor();
		this.desc=bookDto.getDesc();
		this.logo=bookDto.getLogo();
		this.price=bookDto.getPrice();
		this.quantity=bookDto.getQuantity();
				
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
