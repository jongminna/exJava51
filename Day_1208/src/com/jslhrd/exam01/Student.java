package com.jslhrd.exam01;
public class Student {
	private int bun;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double ave;
	private int rank;
	
	public Student(int bun,String name,int kor, int eng, int mat) {
		this.bun=bun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return s.bun==bun && s.name.equals(name);
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return bun+"\t"+name+"\t"+kor;
	}
}
