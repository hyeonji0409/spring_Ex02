package com.boot.projectEx.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.boot.projectEx.model.MemberVO;
import com.boot.projectEx.service.MemberService;

@Controller
public class MemberController {
	
	// DI 설정
	@Autowired
	MemberService service;

	// 로그인 폼으로 이동
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "/member/loginForm";
	}
	
	// 로그인 기능 구현
	// 로그인 처리 : id와 pwd 전달 받아서 로그인 체크
	@ResponseBody
	@RequestMapping("/login")
	public String loginCheck(@RequestParam HashMap<String, Object> param,
											   HttpSession session) {
		
		// 로그인 체크 결과
		MemberVO vo = service.loginCheck(param);
		String result = "fail";
		
		if(vo != null) {
			//로그인 성공하면 세션 변수 지정
			session.setAttribute("sid", vo.getMemId());
			result = "success";
		}
		
		return result;
	}
	
	// 로그아웃 기능 구현
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	// 회원가입 폼으로 이동
	@RequestMapping("/joinForm")
	public String joinForm() {
		return "/member/joinForm";
	}
	
	// 회원가입
	@RequestMapping("/join")
	public String joinMember(MemberVO vo) {
		service.joinMember(vo);
		
		return "redirect:./loginForm";
	}
	
	// 아이디 중복 체크
	@ResponseBody
	@RequestMapping("/memIdCheck")
	public String memIdCheck(@RequestParam("memId") String memeId) {
		String memId_result = service.memIdCheck(memeId);
		
		String result = "use";
		if(memId_result != null) {
			result = "no_use";
		}
		
		return result;
	}
	
}
