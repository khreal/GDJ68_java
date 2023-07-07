package com.khj.study5.s2;

import java.util.Scanner;

public class S2Main {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.setMaker("SamSung");
		computer.setModel("galexyBook");
		computer.setCpu("i9");
		computer.setColor("white");
		computer.setPrice(5000000);
		computer.setPoint(20);
		
		Tv tv = new Tv();
		tv.setMaker("LG");
		tv.setModel("파브");
		tv.setColor("black");
		tv.setPrice(1500000);
		tv.setPoint(30);
		tv.setInch(80);
		
		Phone phone = new Phone();
		phone.setMaker("apple");
		phone.setModel("iphone15");
		phone.setColor("silver");
		phone.setPrice(1200000);
		phone.setPoint(15);
		phone.setOs("ios");
		
		Customer winter = new Customer();
		ElectroMachine[] elecs= new ElectroMachine[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 가전제품 입력. 1.컴퓨터 2.tv 3.phone");
		int selec1 = sc.nextInt();
		if(selec1==1) {
			elecs[0]=computer;
		}else if(selec1==2) {
			elecs[0]=tv;
		}else if(selec1==3) {
			elecs[0]=phone;
		}
		System.out.println("두번째 가전제품 입력. 1.컴퓨터 2.tv 3.phone");
		int selec2 = sc.nextInt();
		if(selec2==1) {
			elecs[1]=computer;
		}else if(selec2==2) {
			elecs[1]=tv;
		}else if(selec2==3) {
			elecs[1]=phone;
		}		
		
		winter.buy(elecs);
				
		//2개

	}

}
