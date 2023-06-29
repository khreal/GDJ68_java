package com.khj.study2;

import java.util.Scanner;

public class Study4_for {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		//hello 출력
		//키보드로부터 출력 횟수를 입력받음
		System.out.println("횟수 입력");
		int input = sc.nextInt();
		int j;
		for(j=0;input>j;j++) {
			System.out.println("hello");
		}
		System.out.println("hello는 "+input+"번 실행됨");
	}

}