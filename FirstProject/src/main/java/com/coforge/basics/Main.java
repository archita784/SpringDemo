package com.coforge.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.coforge");
		Employee emp= (Employee)context.getBean("employee");
		Employee emp1= context.getBean("employee",Employee.class);
		Employee emp2= (Employee)context.getBean(Employee.class);
		
		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp2);
		
		
	}

}
