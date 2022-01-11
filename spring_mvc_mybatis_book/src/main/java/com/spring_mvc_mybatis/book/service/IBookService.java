package com.spring_mvc_mybatis.book.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring_mvc_mybatis.book.model.BookVO;

public interface IBookService {
	// ���� Ŭ�������� �������̵��� �߻� �޼ҵ� ����
	ArrayList<BookVO> listAllBook();
	void insertBook(BookVO bookVo);
	void updateBook(BookVO bookVo);
	void deleteBook(String bookNo);
	BookVO detailViewBook(String bookNo);
	String bookNoCheck(String bookNo);
	ArrayList<BookVO> bookSearch(HashMap<String, Object> map);
}
