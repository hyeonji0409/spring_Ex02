package com.spring_mvc.project;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	// home���� studentForm ������ ��û���� ó��
	@RequestMapping("/student/studentForm")
	public String studentFormView() {
		return "student/studentForm";
	}
	
	// (1) HttpServletRequest Ŭ������ getParameter ��� 
	@RequestMapping("/student/newStudent")
	public String insertStudent(HttpServletRequest request, Model model) {
		// form�� <input> �±��� name �Ӽ� �� �޾Ƽ� ������ ����
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String year = request.getParameter("year");
		
		// view �������� Ǯ�� : Model ����
		model.addAttribute("no", no);
		model.addAttribute("name", name);
		model.addAttribute("year", year);
		
		return "student/studentResult";
	}
}
