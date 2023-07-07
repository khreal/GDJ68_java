package com.khj.study4.s3;

public class Car {

	String company;
	int price; //default
	String brand;
	public String color;
	
	
	//생성자(Constructor)
	//접근 지정자 클래스명과 동일한이름([매개변수선언]){}
	public Car() {
		this("a7");
		this.company="audi";
		this.brand="A7";
		this.color="pink";
		this.price=9985;
	}
	
	
	
	public Car(String brand) {
		this(brand, "pink");
//		this.company="audi";
//		this.brand=brand;
//		this.color="pink";
//		this.price=9985;
	}
	
	public Car(String brand, String color) {
		this(brand,color,9985);
//		this.company="audi";
//		this.brand=brand;
//		this.color=color;
//		this.price=9985;
	}
	
	public Car(String brand, String color, int price) {
		this.company="audi";
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	
	
	
	public void info() {
		System.out.println("Company: "+this.company);
		System.out.println("Brand: "+this.brand );
		System.out.println("Color: "+this.color );
		System.out.println("Price: "+this.price );
		
	}
}
