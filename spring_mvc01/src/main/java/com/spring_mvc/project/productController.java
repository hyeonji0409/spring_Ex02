package com.spring_mvc.project;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class productController {

	@RequestMapping("product/productForm")
	public String productFormView() {
		return "product/productForm";
	}
	
	@RequestMapping("/product/newProduct")
	public String insertProduct(HttpServletRequest request, Model model) {
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String company = request.getParameter("company");
		String date = request.getParameter("date");
		String qty = request.getParameter("qty");
		
		model.addAttribute("no", no);
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		model.addAttribute("company", company);
		model.addAttribute("date", date);
		model.addAttribute("qty", qty);
		
		return "product/productResult";
	}
	
	@RequestMapping("/product/newProduct2")
	public String insertProduct2(@RequestParam("no") String no, 
								@RequestParam("name") String name, 
								@RequestParam("price") String price,
								@RequestParam("company") String company,
								@RequestParam("date") String date,
								@RequestParam("qty") String qty,
								Model model) {
		
		// view 페이지로 풀력 : Model 설정
		model.addAttribute("no", no);
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		model.addAttribute("company", company);
		model.addAttribute("date", date);
		model.addAttribute("qty", qty);
		
		return "product/productResult";
		
	}
	
	@RequestMapping("/product/newProduct3")
	public String insertProduct3(Product product) {
		// Command 객체는 자동으로 View Model에 등록됨 : Model 설정 필요 없음
		System.out.println(product.getName()); //콘솔에 출력
		return "product/productCmdResult";
	}
}
