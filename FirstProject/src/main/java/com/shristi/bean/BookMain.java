package com.shristi.bean;

import java.util.stream.Stream;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookMain {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.shristi");
		Book book =context.getBean("getBook",Book.class);
		System.out.println(book);
		
		String[] beans = context.getBeanDefinitionNames();
		Stream.of(beans).forEach(System.out::println);
	}

}
