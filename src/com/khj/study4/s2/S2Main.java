package com.khj.study4.s2;

import java.util.Scanner;

public class S2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService sv = new StudentService();
		Student student = sv.makeStudentOne();
		System.out.println(student.avg);
		
	}

}
