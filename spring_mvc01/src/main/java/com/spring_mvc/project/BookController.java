package com.spring_mvc.project;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

	@RequestMapping("/bookInfoView1")
	public String bookInfoView1(Model model) {
		model.addAttribute("bookTitle", "Java");
		model.addAttribute("price", 25000);
		return "book/bookInfoView1"; // 뷰 페이지 이름 : showInfo.jsp, 위치:views 폴더
	}

	@RequestMapping("/bookInfoView2")
	public ModelAndView bookInfoView2(ModelAndView mv) {
		mv.addObject("bookTitle", "Spring");
		mv.addObject("price", "23000");

		// 뷰 페이지 설정 : bookInfoView2.jsp
		mv.setViewName("book/bookInfoView1");

		return mv;
	}

	@RequestMapping(value = { "/bookInfoView3", "/bookInfoView4" })
	public String showBookInfo34(HttpServletRequest request, Model model) {
		if (request.getServletPath().equals("/bookInfoView3")) {
			model.addAttribute("bookTitle", "영어 회화");
			model.addAttribute("price", 30000);
		} else if (request.getServletPath().equals("/bookInfoView4")) {
			model.addAttribute("bookTitle", "수학의 정석");
			model.addAttribute("price", 40000);
		}
		return "book/bookInfoView1";
	}
}
