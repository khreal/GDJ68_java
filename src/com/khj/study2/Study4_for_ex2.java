package com.khj.study2;

import java.util.Scanner;

public class Study4_for_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id=1234;
		int pw=5678;
		boolean login = false;
		//로그인 시도는 최대 5번
		
		for (int i=0;i<5;i++) {
			System.out.println("아이디를 입력하시오");
			int inputId=sc.nextInt();
			System.out.println("비밀번호를 입력하시오");
			int inputPw=sc.nextInt();
			
			if (inputId==id && inputPw==pw) {
				System.out.println("로그인 성공");
				i=i+4;
				login = true;
			} else if (i<4){System.out.println("다시 시도하세요");}
				else {System.out.println("로그인 정보가 틀렸습니다");}
			
		} 
		if (login) {
			System.out.println("급여를 입력하세요");
			int pay = sc.nextInt();
			System.out.println("급여는 "+pay+"원 입니다.");
		}
		
	}

}
