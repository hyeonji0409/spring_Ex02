package com.spring_mvc.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;

@Controller 
public class NewController {
	@RequestMapping("/newView")
	public String newView() {
		return "newView"; // 뷰 페이지 이름 반환 : newView.jsp
		// 뷰 페이지 이름 반환
	}
	
	// 뷰 페이지로 데이터 전달
	// 'showInfo' 요펑이 들어오면 Model객체를 이용하여 데이터 설정
	@RequestMapping("/showInfo")
	public String showInfo(Model model) {
		model.addAttribute("name", "홍길동");
		model.addAttribute("age", 30);
		return "showInfo"; // 뷰 페이지 이름 : showInfo.jsp, 위치:views 폴더
	}
	
	@RequestMapping("/showInfo2")
	public ModelAndView showInfo2(ModelAndView mv) {
		mv.addObject("name", "몽룡");
		mv.addObject("address", "서울");
		
		// 뷰 페이지 설정 : showInfo2.jsp
		mv.setViewName("showInfo2");
		
		return mv;
	}
	
	// Model과 ModelAndView 2개 사용
	@RequestMapping("/showInfo3")
	public ModelAndView showInfo3(Model model, ModelAndView mv) {
		model.addAttribute("name", "구름");
		
		mv.addObject("name", "몽룡");
		mv.addObject("age", "20");
		mv.addObject("address", "서울");
		
		// 뷰 페이지 설정 : showInfo3.jsp
		mv.setViewName("showInfo3");
		
		return mv;
	}
}

