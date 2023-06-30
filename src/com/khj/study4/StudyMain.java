package com.khj.study4;

public class StudyMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Card card = new Card();
		
		Card card2 = new Card();
		card.cardNumber=3.1;
		
		System.out.println(card.cvc);
		System.out.println(card.name);
		
		System.out.println("프로그램 종료");
	}

}
