package com.coforge.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.coforge");
		Bike bik = (Bike) context.getBean("bike");
		System.out.println(bik);
	}
}
