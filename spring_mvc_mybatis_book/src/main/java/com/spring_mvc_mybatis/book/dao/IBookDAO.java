package com.spring_mvc_mybatis.book.dao;

import java.util.ArrayList;

import com.spring_mvc_mybatis.book.model.BookVO;

public interface IBookDAO {	
	ArrayList<BookVO> listAllBook();
	void insertBook(BookVO bookVo);
	void updateBook(BookVO bookVo);
	void deleteBook(String bookNo);
	BookVO detailViewBook(String bookNo);
}
