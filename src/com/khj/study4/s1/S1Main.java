package com.khj.study4.s1;

public class S1Main {

	public static void main(String[] args) {
		//
		Hap hap = new Hap();
		
		int sum = hap.h1(10, 20);
		
		//h2
		boolean flag = hap.h2(20);
		System.out.println(flag);
		
//		System.out.println(sum*2);
		//h3
		int [] ar = hap.h3(4);
		System.out.println(ar.length);

	}

}
