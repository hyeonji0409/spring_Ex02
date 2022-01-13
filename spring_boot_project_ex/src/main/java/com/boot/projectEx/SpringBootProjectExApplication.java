package com.boot.projectEx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.boot.projectEx.controller.MainController;
import com.boot.projectEx.controller.MemberController;
import com.boot.projectEx.controller.ProductController;
import com.boot.projectEx.dao.IMemberDAO;
import com.boot.projectEx.dao.IProductDAO;
import com.boot.projectEx.service.IMemberService;

@SpringBootApplication
@ComponentScan(basePackageClasses = MainController.class)
@ComponentScan(basePackageClasses = ProductController.class)
@ComponentScan(basePackageClasses = MemberController.class)
@MapperScan(basePackageClasses = IMemberDAO.class)
@MapperScan(basePackageClasses = IProductDAO.class)
public class SpringBootProjectExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectExApplication.class, args);
	}

}
