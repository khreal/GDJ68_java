package com.khj.study2;

import java.util.Scanner;

public class Study3_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//회원가입시 입력한 데이터
		int id=1234;
		int pw=5678;
		int goyong = 0;
		double pay=0;
		//로그인 과정
		//id와 pw를 입력받아서 로그인 처리
		//로그인 성공,실패 메시지
		System.out.println("아이디 입력");
		id = sc.nextInt();
		if (id==1234) {
			System.out.println("비밀번호 입력");
			pw=sc.nextInt();
			if (pw==5678) {
				System.out.println("로그인 성공");
				System.out.println("정규직은 1번, 계약직은 2번 입력");
				goyong=sc.nextInt();
				if (goyong==1)  {
					System.out.println("급여를 입력하시오");
					pay=sc.nextInt();
					System.out.println("급여 : "+pay*.93+"원 입니다");
				}else if(goyong==2) {
					System.out.println("급여를 입력하시오");
					pay=sc.nextInt();
					System.out.println("급여 : "+pay*.967+"원 입니다");
					
				}else {
					System.out.println("잘못입력함");
				}				
		   }else {
			   System.out.println("로그인 실패: 비밀번호가 틀림");
		   }			
		}else {
			System.out.println("로그인 실패: 아이디가 틀림");
		}
		
		
		
		
		
		}
		
}	
		
		//-- 로그인 처리 후 시작
		//로그인이 성공한 사람만 실행 가능
		//1. 정규직, 2.계약직
		//급여 입력
		//정규직 : 건강보험 3%, 국민연금 2%, 고용보험 1%, 산재보험 1%
		//계약직 : 원청징수 3.3%
		//실급여 출력
		




