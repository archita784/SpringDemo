package com.coforge.Demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Accessories {
	String name;
	double price;
	public String getName() {
		return name;
	}
	@Value(value="tool kit")
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	@Value(value="500")
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Accessories [name=" + name + ", price=" + price + "]";
	}

}
