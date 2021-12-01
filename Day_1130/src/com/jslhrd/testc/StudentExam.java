package com.jslhrd.testc;
public class StudentExam {
	public static void main(String[] args) {
		Student stu = new Student(1,"김학생", 25);
		stu.studentPrint();
		//stu.age=-1;
		stu.setAge(-1);
		stu.studentPrint();
		
		System.out.println("이름 :" + stu.getName());
	}

}
