package com.shristi.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

	@Bean
	public Book getBook() {
		return new Book();
	}
	
	@Bean
	@Primary
	public Publisher pubtwo() {
		Publisher pub= new Publisher();
		pub.setPubnam("xyz");
		pub.setCopies(900);
		
		return pub;
	}
}
