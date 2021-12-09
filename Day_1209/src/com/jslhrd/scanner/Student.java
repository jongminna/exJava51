package com.jslhrd.scanner;

public class Student {
	private int bun;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double ave;
	private int rank;
	public Student(int b, String n,int k, int e, int m) {
		bun=b;
		name=n;
		kor=k;
		eng=e;
		mat=m;
		tot=k+e+m;
		ave=tot/3.;
	}
	
	//객체비교
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu =(Student)obj;
			return bun==stu.bun && name.equals(stu.name);
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return bun+"\t"+name+"\t"+kor+
				"\t"+eng+"\t"+mat+"\t"+tot+"\t"+ave+"\t"+rank;
	}
	
	
}
