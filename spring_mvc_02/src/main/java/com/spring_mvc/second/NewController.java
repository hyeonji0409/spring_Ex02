package com.spring_mvc.second;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {
	@RequestMapping("/index")
	public String index() {
		
		return "index"; // 뷰 페이지 이름 반환 : newView.jsp
		// 뷰 페이지 이름 반환
	}
}
