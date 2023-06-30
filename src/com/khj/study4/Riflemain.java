package com.khj.study4;

import java.util.Scanner;

public class Riflemain {

	public static void main(String[] args) {
		Rifle rifle = new Rifle();
		
		//맴버들 사용법
		//1. 맴버변수 변수명.맴버변수명
		//2. 맴버메서드 변수명.맴버메서드명()
		
		//메서드 호출
//		rifle.shoot1();
//		rifle.shoot2();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.단발 2.점사");
		int select=sc.nextInt();

		System.out.println("총알수 입력");
		int b=sc.nextInt();
		
		if(select==1) {			
			rifle.shoot1(b);			
		}else {
			rifle.shoot2();
		}
	}

}
