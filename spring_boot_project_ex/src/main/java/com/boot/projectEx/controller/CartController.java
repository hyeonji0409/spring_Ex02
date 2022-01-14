package com.boot.projectEx.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.projectEx.model.CartVO;
import com.boot.projectEx.service.ICartService;

@Controller
public class CartController {
	// DI
	@Autowired
	ICartService service;
	
	// 장바구니에 상품 추가
	@RequestMapping("/product/insertCart")
	public String insertCart(CartVO vo, HttpSession session) {
		// 로그인 성공 시 설정한 세션 sid 값 가져와서 memId에 저장
		String memId = (String)session.getAttribute("sid");
		vo.setMemId(memId);
		
		// 동일 상품이 존재하는지 확인(checkPrdInCart)
		int count = service.checkPrdInCart(vo.getPrdNo(), memId);
		
		// 동일 상품이 존재하지 않는 경우 처리(장바구니에 추가)
		if(count == 0) {
			service.insertCart(vo);
		} else { // 존재하면 주문수량 변경
			service.updateQtyInCart(vo);
		}
		
		// 장바구니 목록 요청
		return "redirect:/product/cartList";
	}
	
	// 장바구니 목록 보기
	@RequestMapping("/product/cartList")
	public String cartList(Model model, HttpSession session) {
		String memId = (String)session.getAttribute("sid");
		ArrayList<CartVO> cartList = service.cartList(memId);
		model.addAttribute("cartList", cartList);
		
		return "product/cartListView";
	}
	
	// 장바구니 삭제
	@ResponseBody
	@RequestMapping("/product/deleteCart")
	public int deleteCart(@RequestParam("chbox[]") ArrayList<String> chkArr) {
		int result = 0;
		String cartNo = "";
		
		if(chkArr != null) {
			for(String i : chkArr) {
				cartNo = i;
				service.deleteCart(cartNo);
			}
			result = 1;
		}
		
		return result;
	}
}
