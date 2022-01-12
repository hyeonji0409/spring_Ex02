package com.multi.myboot01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping("/")
	public String home() {
		return "hello boot!";
	}
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message", "안녕하세요");
		return "hello";
	}
}
