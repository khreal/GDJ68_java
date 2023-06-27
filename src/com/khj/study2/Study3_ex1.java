package com.khj.study2;

import java.util.Scanner;

public class Study3_ex1 {

	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총점 평균 계산(평균은 int)
		//90점이상:a, 80이상:b, 70이상:c, 60:d 그외 f
		//switch 사용
		Scanner sc1 = new Scanner(System.in);
		System.out.println("국어");
		int kor = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("영어");
		int eng = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("수학");
		int math = sc3.nextInt();
		
		int avr = (kor+eng+math)/3;
		
		switch ((kor+eng+math)/3) {
		case 100:
			System.out.println("A");
			break;
		case 99:
			System.out.println("A");
			break;
		}

	}

}
