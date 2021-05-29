package com.shristi.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pubone")
public class Publisher {
	private String pubnam;
	private int copies;
	public String getPubnam() {
		return pubnam;
	}
	//@Value("ABC")
	public void setPubnam(String pubnam) {
		this.pubnam = pubnam;
	}
	public int getCopies() {
		return copies;
	}
	//@Value("300")
	public void setCopies(int copies) {
		this.copies = copies;
	}
	@Override
	public String toString() {
		return "Publisher [pubnam=" + pubnam + ", copies=" + copies + "]";
	}
	
	

}
