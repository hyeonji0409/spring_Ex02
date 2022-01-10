package com.spring_mvc_mybatis.book.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring_mvc_mybatis.book.dao.IBookDAO;
import com.spring_mvc_mybatis.book.model.BookVO;

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

}
