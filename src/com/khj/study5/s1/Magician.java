package com.khj.study5.s1;

public class Magician extends Charactor {


	public Magician() {
		super();//부모생성자 호출
	}
	
	private int mp;
	
	
	
	
		
	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	//overriding: 수정
	//상속받은 메서드의 내용을 자기에맞게 재정의
	//상속받은 메서드의 선언부는 동일
	public void attack() {
		System.out.println("파이어볼");
	}
	
	
}
