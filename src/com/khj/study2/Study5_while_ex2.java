package com.khj.study2;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int hp=2240; //유저의 hp
		int monhp=60; //몬스터의 hp
		int monpower=40; //몬스터의 공격력
		boolean life = true;
		int turn = 1;
		int skill = 3;
		//유저 정보: hp, 몬스터 정보:hp
		//1.평타 2.스킬 3.hp회복 4.도망
		//평타 : 0~10 미만의 공격이 몬스터에게 가해짐
		//스킬 : 0~30 미만의 공격이 몬스터에게 가해짐(최대3번까지만)
		//회복 : 회복량 0~40 까지 회복
		//도망 : 50%확률로 성공, 실패
		
		//몬스터
		//1 : 유저를 공격 0~40의 공격을 유저에게
		System.out.println("몬스터를 만났습니다. 전투시작");
		
		while(life) {
			System.out.println("행동 선택: 1.평타 2.스킬 3.HP회복 4.도망");
			int act = sc.nextInt();
			if (turn == 1) {
				switch(act) {
				case 1:
					System.out.println("평타 공격!");
					int att = random.nextInt(10);
					System.out.println(att+"의 피해를 입혔습니다.");
					monhp-=att;
					if (monhp<1) {
						System.out.println("몬스터 사망");
						turn=3;
						break;
					}
					System.out.println("몬스터 HP : "+monhp);	
					turn = 2;
					break;
				case 2:	
					if(skill==0) {
						System.out.println("스킬이 포인트가 부족합니다! 다른 행동을 선택해 주세요."); 
						turn=1;
						break;
					}
					System.out.println("스킬 공격!!");
					skill-=1;
					int att1 = random.nextInt(30);
					System.out.println(att1+"의 피해를 입혔습니다.");
					System.out.println("남은 스킬 포인트"+skill);
					monhp-=att1;
					if (monhp<1) {
						System.out.println("몬스터 사망");
						turn=3;
						break;
					}
					System.out.println("몬스터 HP : "+monhp);
					if (monhp<1) {
						break;
					}
					turn = 2;
					break;
				case 3:
					System.out.println("HP 회복");
					int heal = random.nextInt(40);					
					System.out.println("HP "+heal+"을 회복.");
					hp+=heal;
					if (hp>40) {
						hp=40;
					}
					System.out.println("현재 HP : "+hp);
					turn = 2;
					break;
				case 4:
					System.out.println("도망 시도");
					int run = random.nextInt(2);
					if (run==1) {
						System.out.println("도망성공!!");
						turn=3;
						break;
					}	
					else {
						System.out.println("도망실패ㅠㅠ");
						turn=2;
					}
					break;
				default:
					System.out.println("잘못 입력했습니다. 다시 입력하세요");
				}
				
			}   if(turn==2) { //몬스터 공격
				System.out.println("몬스터 공격");	
				int att3 = random.nextInt(41);
				System.out.println("유저에게"+att3+"의 데미지!");	
				hp-=att3;		
				if (hp<1) {
					hp=0;System.out.println("유저의 HP : "+hp+" 죽었습니다");
					turn=3;
					break;
				}
				System.out.println("유저의 HP : "+hp);
				turn=1;			
			}  if(turn==3){
				System.out.println("전투가 종료되었습니다."); 
				break;
			   }			
		}		
		sc.close();
	}
}
