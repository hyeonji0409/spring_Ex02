package com.spring_mvc_mybatis.book.service;

import java.util.ArrayList;

import com.spring_mvc_mybatis.book.model.BookVO;

public interface IBookService {
	// 구현 클래스에서 오버라이딩할 추상 메소드 선언
	ArrayList<BookVO> listAllBook();
	void insertBook(BookVO bookVo);
	void updateBook(BookVO bookVo);
	void deleteBook(String bookNo);
	BookVO detailViewBook(String bookNo);
}
