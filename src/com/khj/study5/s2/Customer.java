package com.khj.study5.s2;

import java.util.Scanner;

public class Customer {

	private int money;
	private int point;
	
	public Customer() {
		this.money=10000000;
		this.point=50;
	}
	
	public void buy(ElectroMachine electromachine) {
		this.money=this.money-electromachine.getPrice();
		this.point=this.point+electromachine.getPoint();		
		System.out.println(this.money);
		System.out.println(this.point);
	}
	
	public void buy(ElectroMachine[] eles) {
		for(int i =0;i<eles.length;i++) {
		this.buy(eles[i]);
		}
	}
	
	
}
