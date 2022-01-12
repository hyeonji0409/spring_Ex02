package com.multi.myboot02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.multi.book.BookController;
import com.multi.book.IBookDAO;


@SpringBootApplication
@ComponentScan(basePackageClasses = BookController.class)
@MapperScan(basePackageClasses = IBookDAO.class)
public class Myboot03Application {

	public static void main(String[] args) {
		SpringApplication.run(Myboot03Application.class, args);
	}

}
