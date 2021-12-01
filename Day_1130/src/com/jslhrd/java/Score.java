package com.jslhrd.java;

public class Score {
	Student student;
	int kor;
	int eng;
	int mat;
	Score(){}
	Score(Student student, int kor, int eng, int mat){
		this.student=student;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	
	void scorePrint() {
		student.studentPrint();
		System.out.println(kor+"\t"+eng+"\t"+mat);
	}
}
