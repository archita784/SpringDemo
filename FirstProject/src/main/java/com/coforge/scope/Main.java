package com.coforge.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context =new AnnotationConfigApplicationContext("com.coforge.scope");
		User user=context.getBean(User.class);
		System.out.println(user);
		context.close();
	}

}
