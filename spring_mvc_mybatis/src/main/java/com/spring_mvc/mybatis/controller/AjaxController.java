package com.spring_mvc.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	
	// �α��� ������ �̵�
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "ajax/loginForm"; //loginForm.jsp �� ������
	} 
	
	// �α��� ó��
	@ResponseBody
	@RequestMapping("/login")
	public String loginCheck(@RequestParam("id") String id, @RequestParam("pw") String pw) {
		// �α��� üũ(����)
		String result = "fail";
		if(id.equals("abcd") && pw.equals("1234"))
			result = "success";
		else {
			result = "fail";
		}
		return result;		
		
		//@ResponseBody�� ���� �ܿ� success.jsp�� fail.jsp�� ��ȯ
		// @ResponseBody�� �մ� ��� : ����(body)�� result �����ؼ� ��ȯ (�� ���������� sucdess �Ǵ� fail ��ȯ)
	}
	
	@RequestMapping("/loginForm2")
	public String loginForm2() {
		return "ajax/loginForm2"; //loginForm.jsp �� ������
	} 
}
