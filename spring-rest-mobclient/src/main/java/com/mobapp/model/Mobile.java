package com.mobapp.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mobile {

	private Integer mobileId;
	private String model;
	private String brand;
	private double price;
	
	
}
