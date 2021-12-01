package com.jslhrd.java;

public class ScoreExam {
	public static void main(String[] args) {
		Score sc1 = new Score(
						new Student("1101","aaa", 26),90,88,90);
		
		System.out.println("학번 :" + sc1.student.bun );
		System.out.println("이름 :" + sc1.student.name);
		System.out.println("나이 :" + sc1.student.age);
		System.out.println("국어 :" + sc1.kor);
		System.out.println("영어 :" + sc1.eng);
		System.out.println("수학 :" + sc1.mat);
		
		sc1.scorePrint();
	}

}
