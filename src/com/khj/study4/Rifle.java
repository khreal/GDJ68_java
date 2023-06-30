package com.khj.study4;

public class Rifle {
	
	boolean mod;//true단발, false점사
	
	//메서드 선언 공식
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){실행코드}
	//public  static    void   main (String [] args) {}
	
	public void shoot1(int count) {
		int damege=20;
		for (int i =0;i<count;i++) {
		System.out.println("탕");
		}
		count=10;
	}
	
	//shoot2 점사쏘기
	
	public void shoot2() {
		System.out.println("타타탕");
	}

}
