package com.spring_mvc.project;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	// (2) @RequestParam ������̼� ���
	@RequestMapping("/student/newStudent2")
	public String insertStudent2(@RequestParam("no") String no, 
								@RequestParam("name") String name, 
								@RequestParam("year") String year,
								Model model) {
		
		// view �������� Ǯ�� : Model ����
			model.addAttribute("no", no);
			model.addAttribute("name", name);
			model.addAttribute("year", year);
			
			return "student/studentResult";
		
	}
	
	// (3) Command ��ü ���
	@RequestMapping("/student/newStudent3")
	public String insertStudent3(Student student) {
		// Command ��ü�� �ڵ����� View Model�� ��ϵ� : Model ���� �ʿ� ����
		System.out.println(student.getName()); //�ֿܼ� ���
		return "student/studentCmdResult";
	}
	
	@RequestMapping("/student/newStudent4")
	public String insertStudent4(@ModelAttribute("stdInfo") Student student) {
		return "student/studentCmdRenameResult";
	}
	
	// (4) url�� ���� ������ ���� : @PathVariable ������̼� ���
	@RequestMapping("/student/studentModify/{stdNo}")
	public String studentModify(@PathVariable String stdNo) {
		// ���� ó���ߴٰ� �����ϰ�
		System.out.println(stdNo);
		// home �������� �̵�
		// return "jsp/home";
		return "redirect:/";
	}
}
