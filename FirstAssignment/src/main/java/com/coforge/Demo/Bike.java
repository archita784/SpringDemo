package com.coforge.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {

	String model;
	
	Features features;
	
	Insurance insurance;
	public String getModel() {
		return model;
	}
	@Value(value="hero")
	public void setModel(String model) {
		this.model = model;
	}
	public Features getFeatures() {
		return features;
	}
	@Autowired
	public void setFeatures(Features features) {
		this.features = features;
	}
	public Insurance getInsurance() {
		return insurance;
	}
	@Autowired
	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
	@Override
	public String toString() {
		return "Bike [model=" + model + ", features=" + features + ", insurance=" + insurance + "]";
	}
	
	
}

