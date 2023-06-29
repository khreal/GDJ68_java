package com.khj.study2;

import java.util.Scanner;

//import java.util.Random;

public class Study4_for_ex3 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Random random = new Random();
		Scanner sc = new Scanner(System.in);
//		
//		
//		for(int i=0;i<5;i++) {
//			int num= random.nextInt(3); //0~3미만의 정수 한개를 램덤
//			
//			switch(num) {
//			case 0:
//				System.out.println(num);
//				break;
//			case 1:
//				System.out.println(num);
//			default:
//				System.out.println(num);
//			}
//		}
		
//		for (int i=1;i<10;i++) {
//			System.out.println(3+"*"+i+"="+3*i);
//		}
//		
		//0분0초 5분 59초
		//종료할 분, 초를 입력받아서
		//해당분 초가 되면 종료
		System.out.println("전자렌지 가동 분을 입력하세요");
		int inmin = sc.nextInt();
		System.out.println("전자렌지 가동 초를 입력하세요");
		int insec = sc.nextInt();
		System.out.println("전자렌지가 "+inmin+"분, "+insec+"초 가동됩니다");
		for (int min=0;min<6;min++) {			
			for (int sec=0;sec<60;sec++) {
				System.out.println(min+"분"+sec+"초");
				if(insec==sec && inmin==min) {
					break;
				}
			}
			if(inmin==min) {
				break;
			}			 
		}
		System.out.println("전자렌지가 "+inmin+"분 "+insec+"초 돌아갔습니다");
		
		sc.close();
	}

}
