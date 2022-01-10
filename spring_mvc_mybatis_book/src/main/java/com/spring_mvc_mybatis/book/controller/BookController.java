package com.spring_mvc_mybatis.book.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring_mvc_mybatis.book.model.BookVO;
import com.spring_mvc_mybatis.book.service.BookService;

@Controller
public class BookController {

	// DI ����
	@Autowired
	BookService service;

	// ���� �� index ������ ����
	@RequestMapping("/")
	public String viewIndex() {
		return "index";
	}

	// ��ü ���� ��ȸ
	@RequestMapping("/book/listAllBook")
	public String listAllBook(Model model) {
		ArrayList<BookVO> bookList = service.listAllBook();
		model.addAttribute("bookList", bookList);

		return "book/bookListView";
	}

	// ���� ��� �� �̵�
	@RequestMapping("/book/newBookForm")
	public String newBookForm() {
		return "book/newBookForm";
	}

	// ���� ���
	@RequestMapping("/book/insertBook")
	public String insertBook(BookVO book) {
		System.out.println(book.getBookNo());
		service.insertBook(book);
		return "redirect:./listAllBook";
	}

	// �� ������ �̵�
	@RequestMapping("/book/detailViewBook/{bookNo}")
	public String detailViewBook(@PathVariable String bookNo, Model model) {
		BookVO book = service.detailViewBook(bookNo);
		model.addAttribute("book", book);
		return "book/bookDetailView";
	}

	// ���� ȭ�� ������ �̵� (�����ϱ� ���� ��ǰ �� ������ ȭ�鿡 ���� ���)
	@RequestMapping("/book/updateBookForm/{bookNo}")
	public String updateBookForm(@PathVariable String bookNo, Model model) {
		// ��ǰ���� �����ϰ�, �ش� ��ǰ ������ �޾ƿ���
		BookVO book = service.detailViewBook(bookNo); // �� ��ǰ ��ȸ �޼ҵ� �״�� ���
		model.addAttribute("book", book);
		return "book/updateBookForm";
	}

	// ���� ���� ���� : ������ ��ǰ ���� DB�� ����
	@RequestMapping("/book/updateBook")
	public String detailViewBook(BookVO book) {
		service.updateBook(book);
		return "redirect:./listAllBook"; // ��ü ���� ��ȸ �������� ������
	}

	// ���� ���� ����
	@RequestMapping("/book/deleteBook/{bookNo}")
	public String deleteBook(@PathVariable String bookNo) {
		service.deleteBook(bookNo);
		return "redirect:../listAllBook"; // ��ü ���� ��ȸ �������� �̵�
	}
}
