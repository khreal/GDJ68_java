package com.khj.study4.s3;

public class Phone {

	String company="apple";
	String brand="iphone15";
	
	{
		//Instance 초기화 블럭 
		this.company="lg";
		this.brand="가로본능";
	}
	
	public Phone() {
		this.company="samsung";
		this.brand="s20";
		
	}
	
	public void info() {
		System.out.println("Company: "+this.company);
		System.out.println("Brand: "+this.brand);
		
	}
	
}
