package com.khj.study4.s2;

import java.util.Scanner;

public class StudentService {
	
	public Student findByNum(Student[] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으려는 학생의 번호");
		int selectNum = sc.nextInt();
		
		Student student=null;
		
		for(int i=0;i<students.length;i++) {
			if(selectNum==students[i].getNum()) {
				student = students[i];
				break;
			}
		}
		
		return student; 		
		
			
	}
		
		
	
	
	public Student makeStudentOne() {
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		System.out.println("이름");
		student.setName(sc.next());
		System.out.println("번호");
		student.setNum(sc.nextInt());
		System.out.println("국어");
		student.setKor(sc.nextInt());
		System.out.println("영어");
		student.setEng(sc.nextInt());
		System.out.println("수학");
		student.setMath(sc.nextInt());
//		student.getTotal()=student.setKor+student.setEng+student.setMath;
//		student.getAvg()=student.setTotal/3.0;
//	
		return student;
		
		
		//학생1명 만들어서 이름, 번호, 국어, 영어, 수학
		//총점 평균을 계산
		//학생을 리턴
		
	}
	
	
	public Student[] makeStudents() {
//		//학생수 입력
//		//학생수 만큼 학생들이 만들어짐
//		//이름, 번호, 국어, 영어, 수학 점수 입력
//		//총점, 평균 계산
//		//학생들을 리턴
//		//1. 학생 배열을 생성
//		//2. 학생수 만큼 반복문 실행
//		//3. 반목문 내에서 이름,번호,국어,영어,수학 입력 총점 평균
//		//4. 해당 학생을 배열에 대입
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();
		
		Student [] students = new Student[count];
		
		for(int i=0;i<count;i++) {
			Student student = new Student();
			System.out.println("이름");
			student.setName(sc.next());
			System.out.println("번호");
			student.setNum(sc.nextInt());
			System.out.println("국어");
			student.setKor(sc.nextInt());
			System.out.println("영어");
			student.setEng(sc.nextInt());
			System.out.println("수학");
			student.setMath(sc.nextInt());
			student.cal();
			students[i]=student;
		}		
		return students;
	}	
}
