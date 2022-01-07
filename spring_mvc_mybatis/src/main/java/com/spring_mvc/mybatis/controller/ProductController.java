package com.spring_mvc.mybatis.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring_mvc.mybatis.model.ProductVO;
import com.spring_mvc.mybatis.service.ProductService;

@Controller
public class ProductController {
	
	// DI 설정
	@Autowired
	ProductService service;
	
   // 실행 시 index 페이지 열기
   @RequestMapping("/")
   public String viewIndex() {
      return "index";
   }
   
   // 전체 상품 조회
   @RequestMapping("/product/listAllProduct")
   public String listAllProduct(Model model) {
	   ArrayList<ProductVO> prdList = service.listAllProduct();
	   model.addAttribute("prdList", prdList);
	  
	   return "product/productListView";
   }
   
   // 상품 등록 폼으로 이동
   @RequestMapping("/product/newProductForm")
   public String newProductForm() {
	   
	   return "product/newProductForm";
   }
   
   // 상품 등록
   @RequestMapping("/product/insertProduct")
   public String insertProduct(ProductVO prd) {
	   System.out.println(prd.getPrdNo());
	   service.insertProduct(prd);
	   return "redirect:./listAllProduct"; // redirect:/product/listAllProduct도 가능
   }
}