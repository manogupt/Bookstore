package com.bridgelabz.Bookstore.dto;

import lombok.Data;

@Data
public class CartDto {
	 private Long userID;
	    private Long bookID;
	    private Integer quantity;
	    private Integer totalPrice;
		public Long getUserID() {
			return userID;
		}
		public void setUserID(Long userID) {
			this.userID = userID;
		}
		public Long getBookID() {
			return bookID;
		}
		public void setBookID(Long bookID) {
			this.bookID = bookID;
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

}
