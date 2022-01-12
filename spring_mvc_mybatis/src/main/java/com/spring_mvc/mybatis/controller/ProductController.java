package com.spring_mvc.mybatis.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

	// ��ǰ �� ���� ������ �̵�
	@RequestMapping("/product/detailViewProduct/{prdNo}")
	public String detailViewProduct(@PathVariable String prdNo, Model model) {
		// ��ǰ���� �����ϰ�, �ش� ��ǰ ���� �޾ƿ���
		ProductVO prd = service.detailViewProduct(prdNo);
		model.addAttribute("prd", prd);
		return "product/productDetailView"; // ��ǰ ������ �� ������
	}

	// ���� ȭ�� ������ �̵� (�����ϱ� ���� ��ǰ �� ������ ȭ�鿡 ���� ���)
	@RequestMapping("/product/updateProductForm/{prdNo}")
	public String updateProductForm(@PathVariable String prdNo, Model model) {
		// ��ǰ���� �����ϰ�, �ش� ��ǰ ������ �޾ƿ���
		ProductVO prd = service.detailViewProduct(prdNo); // �� ��ǰ ��ȸ �޼ҵ� �״�� ���
		model.addAttribute("prd", prd);
		return "product/updateProductForm";
	}

	// ��ǰ ���� ���� : ������ ��ǰ ���� DB�� ����
	@RequestMapping("/product/updateProduct")
	public String detailViewProduct(ProductVO prd) {
		service.updateProduct(prd);
		return "redirect:./listAllProduct"; // ��ü ��ǰ ��ȸ �������� ������
	}

	// ��ǰ ���� ����
	@RequestMapping("/product/deleteProduct/{prdNo}")
	public String deleteProduct(@PathVariable String prdNo) {
		service.deleteProduct(prdNo);
		return "redirect:../listAllProduct"; // ��ü ��ǰ ��ȸ �������� �̵�
	}

	// ��ǰ �ߺ� üũ
	@ResponseBody
	@RequestMapping("product/prdNoCheck")
	public String prdNoCheck(@RequestParam("prdNo") String prdNo) {
		String prdNo_result = service.prdNoCheck(prdNo);

		String result = "use";
		if (prdNo_result != null)
			result = "no_use";

		return result;
	}

	// ��ǰ �˻� ������ �̵�
	@RequestMapping("/product/productSearchForm")
	public String productSearchForm() {
		return "product/productSearchForm";
	}

	// ��ǰ �˻�
	@ResponseBody
	@RequestMapping("/product/productSearch")
	// public ArrayList<ProductVO> productSearch(@RequestParam("type") String type,
	// @RequestParam("keyword") String keyword){
	public ArrayList<ProductVO> productSearch(@RequestParam HashMap<String, Object> param, Model model) {

		ArrayList<ProductVO> prdList = service.productSearch(param);
		model.addAttribute("prdList", prdList);
		return prdList;
	}

	// ��ǰ �˻� ��2�� �̵�
	@RequestMapping("/product/productSearchForm2")
	public String productSearchForm2() {
		return "product/productSearchForm2";
	}

	// �� �������� ��ȯ�Ͽ� ���� �޾ƿ´�.
	@RequestMapping("/product/productSearch2")
	public String productSearch2(@RequestParam HashMap<String, Object> param, Model model) {

		ArrayList<ProductVO> prdList = service.productSearch(param);
		model.addAttribute("prdList", prdList);

		return "product/productSearchResultView"; // �������� ��ȯ
	}

	// ��ǰ �˻� ��3���� �̵�
	@RequestMapping("/product/productSearchForm3")
	public String productSearchForm3() {
		return "product/productSearchForm3";
	}
}