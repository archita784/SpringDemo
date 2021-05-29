package com.coforge.basics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {
	Long phonenum;
	String type;
	public Long getPhonenum() {
		return phonenum;
	}
	@Value(value="23456745")
	public void setPhonenum(Long phonenum) {
		this.phonenum = phonenum;
	}
	public String getType() {
		return type;
	}
	@Value(value="mobile")
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Phone [phonenum=" + phonenum + ", type=" + type + "]";
	}

}
