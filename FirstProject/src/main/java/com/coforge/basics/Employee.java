package com.coforge.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	String name;
	int empId;
	
	
	Address address;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	@Value(value="Sri")
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	@Value(value="10")
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

}
