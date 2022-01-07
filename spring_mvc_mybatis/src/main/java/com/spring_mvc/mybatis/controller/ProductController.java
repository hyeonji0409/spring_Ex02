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
	
	// DI ����
	@Autowired
	ProductService service;
	
   // ���� �� index ������ ����
   @RequestMapping("/")
   public String viewIndex() {
      return "index";
   }
   
   // ��ü ��ǰ ��ȸ
   @RequestMapping("/product/listAllProduct")
   public String listAllProduct(Model model) {
	   ArrayList<ProductVO> prdList = service.listAllProduct();
	   model.addAttribute("prdList", prdList);
	  
	   return "product/productListView";
   }
   
   // ��ǰ ��� ������ �̵�
   @RequestMapping("/product/newProductForm")
   public String newProductForm() {
	   
	   return "product/newProductForm";
   }
   
   // ��ǰ ���
   @RequestMapping("/product/insertProduct")
   public String insertProduct(ProductVO prd) {
	   System.out.println(prd.getPrdNo());
	   service.insertProduct(prd);
	   return "redirect:./listAllProduct"; // redirect:/product/listAllProduct�� ����
   }
}