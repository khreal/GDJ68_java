package com.khj.study3;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 갯수를 입력하세요");
		int j = sc.nextInt();
		
		int [] nums = new int [j];
		
		for(int i=0;i<j;i++) {
			System.out.println(i+1+" 번째 숫자입력");
			nums[i]=sc.nextInt();			
		}
		
		for(int i=0;i<j;i++) {
			System.out.println(nums[i]);
		}
		
		
		
//		int [] nums = new int[3];
//		
//		for (int i=0;i<3;i++) {
//			System.out.println(i+1+" 번쨰 숫자 입력");
//			nums[i]=sc.nextInt();
//		}
//		
		

	}

}
