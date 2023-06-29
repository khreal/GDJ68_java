package com.khj.study2;

import java.util.Scanner;

public class Study5_while_ex1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int id=1;
		int pw=1;
		boolean login=false;
		
		System.out.println("1.로그인시도, 2.프로그램 종료");
		int num = sc.nextInt();
		
		//while
		//1.로그인 시도 2.프로그램 종료
		if(num==1) {
			while(num==1) {
				System.out.println("Id");
				int iId=sc.nextInt();
				System.out.println("Password");
				int iPw=sc.nextInt();
				if(iId==id&&iPw==pw) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("로그인실패");					
				}				
			}
		} else {
			System.out.println("프로그램 종료");
		  }

		//로그인 성공 했을 때만 진행
		//MMORPG
		//시작레벨:1
		//모든 몬스터의 경험치는 동일
		//최대레벨:15
		//시작 골드 GOLD: 0
		//5레벨 달성시 : 1000골드 획득
		//10레벨 달성시 : 2000골드 획득
		//15레벨 달성시 : 3000골드 획득
		//1 -> 2 : 3 
		//2 -> 3 : 6 
		//3 -> 4 : 9
		//4 -> 5 : 12
		//...
		//14 -> 15 : 42
		//레벨업시 게임을 계속할지 종료할 지 선택
		//현재레벨, GOLD가 출력
		int lv=0;
		int gold=0;
		int con=0;
		
		for (lv=1;lv<15;) {
			for(int mon=1; mon<=lv*3 ;mon++) {
				System.out.println("몬스터를 "+mon+" 마리 잡았습니다.");}
				lv++;
				System.out.println(lv+"(으)로 레벨업!");
				switch(lv){
				case 5:
					gold += 1000;
					break;
				case 10:
					gold += 2000;
					break;
				case 15:
					gold += 3000;			
				}
				if (lv==15) {break;}
				System.out.println("게임을 계속하겠습니까? 1.계속, 2:중지");
				con = sc.nextInt();
				if (con==2) {break;}	
		}
		System.out.println("최종 "+lv+"레벨, 획득 GOLD는 "+gold+"GOLD 입니다.");
		
		
	sc.close();	
		
		
	}

}
