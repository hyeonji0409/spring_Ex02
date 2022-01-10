package com.spring_mvc_mybatis.book.model;

import java.sql.Date;

public class BookVO {
	private String bookNo;
	private String bookName;
	private String bookAuthor;
	private int bookPrice;
	private String bookDate;
	private int qtyNo;
	public String getBookNo() {
		return bookNo;
	}
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookDate() {
		return bookDate;
	}
	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}
	public int getQtyNo() {
		return qtyNo;
	}
	public void setQtyNo(int qtyNo) {
		this.qtyNo = qtyNo;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
}
