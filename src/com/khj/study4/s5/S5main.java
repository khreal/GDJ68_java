package com.khj.study4.s5;

public class S5main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest staticTest = new StaticTest();
		//클래스 변수
		StaticTest.staticnum=20;
		StaticTest.staticMethod();
		
		MyCar myCar = new MyCar();
		myCar.brand="A7";
		
		System.out.println(myCar.company);

	}

}
