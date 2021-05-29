package com.studentapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
	private String name;
	private Integer studentId;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(String name, Integer studentId, String city) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.city = city;
	}
	public Student() {
		super();
	}
	

}
