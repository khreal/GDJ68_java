package com.khj.study4;

public class StudentView {
	
	public void view(Student student) {
		StudentMain st = new StudentMain();
		
		
		System.out.println(student.name);
		
		System.out.println(student.gender);
		
	} 
	//Student 정보 출력
	//View 
	public void viewAll(Student [] students) {
		for(int i =0;i<students.length;i++) {
			System.out.println(students[i].name);
			System.out.println(students[i].gender);
		}
	}

}
