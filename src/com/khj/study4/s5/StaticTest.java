package com.khj.study4.s5;

public class StaticTest {
	
	public int instancenum;
	
	public static int staticnum;
	
	public void instanceMethod() {
		StaticTest.staticnum=20;
		System.out.println("맴버메서드");
	}
	
	public static void staticMethod() {
		StaticTest.staticnum=20;
		System.out.println("클래스매서드");
	}
	
	
}
