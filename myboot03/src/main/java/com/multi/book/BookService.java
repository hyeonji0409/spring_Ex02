package com.multi.book;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService{
	@Autowired
	@Qualifier("IBookDAO")
	IBookDAO dao;

	@Override
	public ArrayList<BookVO> listAllBook() {
		return dao.listAllBook();
	}

	@Override
	public void insertBook(BookVO bookVo) {
		dao.insertBook(bookVo);
		
	}

	@Override
	public void updateBook(BookVO bookVo) {
		dao.updateBook(bookVo);
		
	}

	@Override
	public void deleteBook(String bookNo) {
		dao.deleteBook(bookNo);
		
	}

	@Override
	public BookVO detailViewBook(String bookNo) {
		return dao.detailViewBook(bookNo);
	}
	
	@Override
	public String bookNoCheck(String bookNo) {
		return dao.bookNoCheck(bookNo);
	}
	
	public ArrayList<BookVO> bookSearch(HashMap<String, Object> map){
		return dao.bookSearch(map);
	}
}
