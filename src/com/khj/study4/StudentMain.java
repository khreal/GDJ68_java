package com.khj.study4;

public class StudentMain {

	public static void main(String[] args) {

		Student std = new Student();
		
		
		std.name = "홍길동";
		std.gender = 'M';
		
		Student std2 = new Student();
		std2.name = "iu";
		std2.gender = 'M';
				
		//출력
		StudentView sv = new StudentView();
		sv.view(std);
		
		Student [] students = new Student[2];
		students[0]=std;
		students[1]=std2;
		
		sv.viewAll(students);
		
	}

}
