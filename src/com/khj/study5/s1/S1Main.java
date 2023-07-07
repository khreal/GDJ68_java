package com.khj.study5.s1;

public class S1Main {

	public static void main(String[] args) {
		Worrier worrier = new Worrier();
		worrier.getItem();
					
		Magician magician = new Magician();
		magician.getItem();
		
//		worrier.axe.name
		
		Charactor charactor = magician;
		charactor = worrier;
		
		Charactor [] c = new Charactor[2];
		c[0] = worrier;
		c[1] = magician;
		
		worrier = (Worrier) c[0];
		magician = (Magician) c[1];


	}

}
