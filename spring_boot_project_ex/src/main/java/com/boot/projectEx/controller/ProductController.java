package com.boot.projectEx.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.projectEx.model.ProductVO;
import com.boot.projectEx.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService service;

	// 카테고리별 상품 조회
	@RequestMapping("/product/listCtgProduct/{ctgId}")
	public String listCtgProduct(@PathVariable String ctgId, Model model) {
		ArrayList<ProductVO> prdList = service.listCtgProduct(ctgId);
		model.addAttribute("prdList", prdList);

		return "product/productListCtgView";
	}

	// 상품 상세 정보 페이지 이동
	@RequestMapping("/product/detailViewProduct/{prdNo}")
	public String detailViewProduct(@PathVariable String prdNo, Model model) {
		// 상품정보 전달하고, 해당 상품 정보 받아오기
		ProductVO prd = service.detailViewProduct(prdNo);
		model.addAttribute("prd", prd);
		
		return "product/productDetailView"; // 상품 상세정보 뷰 페이지
	}

}
