package com.multi.book;

import java.util.ArrayList;
import java.util.HashMap;

public interface IBookDAO {	
	ArrayList<BookVO> listAllBook();
	void insertBook(BookVO bookVo);
	void updateBook(BookVO bookVo);
	void deleteBook(String bookNo);
	BookVO detailViewBook(String bookNo);
	String bookNoCheck(String bookNo);
	ArrayList<BookVO> bookSearch(HashMap<String, Object> map);
}
