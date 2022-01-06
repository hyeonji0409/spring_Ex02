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
		return "newView"; // �� ������ �̸� ��ȯ : newView.jsp
		// �� ������ �̸� ��ȯ
	}
	
	// �� �������� ������ ����
	// 'showInfo' ������ ������ Model��ü�� �̿��Ͽ� ������ ����
	@RequestMapping("/showInfo")
	public String showInfo(Model model) {
		model.addAttribute("name", "ȫ�浿");
		model.addAttribute("age", 30);
		return "showInfo"; // �� ������ �̸� : showInfo.jsp, ��ġ:views ����
	}
	
	@RequestMapping("/showInfo2")
	public ModelAndView showInfo2(ModelAndView mv) {
		mv.addObject("name", "����");
		mv.addObject("address", "����");
		
		// �� ������ ���� : showInfo2.jsp
		mv.setViewName("showInfo2");
		
		return mv;
	}
	
	// Model�� ModelAndView 2�� ���
	@RequestMapping("/showInfo3")
	public ModelAndView showInfo3(Model model, ModelAndView mv) {
		model.addAttribute("name", "����");
		
		mv.addObject("name", "����");
		mv.addObject("age", "20");
		mv.addObject("address", "����");
		
		// �� ������ ���� : showInfo3.jsp
		mv.setViewName("showInfo3");
		
		return mv;
	}
}

