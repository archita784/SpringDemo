package com.coforge.Demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Insurance {
	String name;
	int duration;
	public String getName() {
		return name;
	}
	@Value(value="vehicle Insurance")
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	@Value(value="24")
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Insurance [name=" + name + ", duration=" + duration + "]";
	}
	

}
