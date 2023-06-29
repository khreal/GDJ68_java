package com.khj.study2;

import java.util.Scanner;

public class Study4_for2_ex1 {

	public static void main(String[] args) {
		//FPS
		//30발, 3탄창
		//M16, 2가지: 단발, 3점사
		
		//1번. 단발, 2번. 점사
		//탕, 타타탕
		Scanner sc = new Scanner(System.in);
		
		for(int tan=90;tan>0;tan=tan-30) {
			
			for(int tan1=30;tan1>0;tan1=tan1-30) {
				System.out.println("1번 단발, 2번 3점사");
				int bal = sc.nextInt();
				if (bal==1) {
					for(tan1=30;tan1>0;tan1--) {
						System.out.println("탕");
					}
				} else if (bal==2){
					for(tan1=30;tan1>0;tan1=tan1-3) {
						System.out.println("타타탕");
					}									
				  }
				else {
					System.out.println("잘못누름");
					tan1 = tan1 + 30;
				}
			}
		}
		 System.out.println("탄약을 모두 소모함");	
		 sc.close();
	
	}
}
