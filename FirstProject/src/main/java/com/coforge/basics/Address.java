package com.coforge.basics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	String city;
	int zipcode;
	@Override
	public String toString() {
		return "Address [city=" + city + ", zipcode=" + zipcode + "]";
	}
	public String getCity() {
		return city;
	}
	@Value(value="goa")
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	@Value(value="345678")
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	

}
