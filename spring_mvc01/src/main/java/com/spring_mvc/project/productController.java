package com.spring_mvc.project;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
		String Date = request.getParameter("Date");
		String qty = request.getParameter("qty");
		
		model.addAttribute("no", no);
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		model.addAttribute("company", company);
		model.addAttribute("Date", Date);
		model.addAttribute("qty", qty);
		
		return "product/productResult";
	}
}
