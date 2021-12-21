package com.jslhrd.set;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student>{
	private int bun;
	private String name;
	private int kor,eng,mat,tot;
	private double ave;
	private String hak;
	public Student() {}
	public Student(int bun,String name,int kor,int eng, int mat) {
		this.bun=bun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		tot = kor+eng+mat;
		ave = tot/3.;
		//학점계산 메소드 호출
	}
	@Override
	public String toString() {
		return bun+"\t"+name+"\t"+kor+"\t";
	}
	//번호기준 정렬(중복검사)
	@Override
	public int compareTo(Student o) {
		return Integer.compare(bun, o.bun);
	}
}
