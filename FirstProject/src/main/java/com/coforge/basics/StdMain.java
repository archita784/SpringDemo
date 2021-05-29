package com.coforge.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StdMain {
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext("com.coforge");
		Student std=(Student)context.getBean("student");
		System.out.println(std);
		System.out.println(std.getAddress());
		System.out.println(std.getPhone());
	}

}
