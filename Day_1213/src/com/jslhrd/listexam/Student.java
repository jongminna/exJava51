package com.jslhrd.listexam;
public class Student implements Comparable<Student> {
	private int bun;
	private String name;
	private int kor,eng,mat,tot;
	private double ave;
	private String memo;
	
	public Student(int bun,String name, int kor, int eng, int mat) {
		this.bun=bun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		tot=kor+eng+mat;
		ave=tot/3.;
		getMemo();
	}
	//평가(수,우,미,양,가
	private void getMemo() {
		
	}
	@Override
	public int compareTo(Student o) {
		return Integer.compare(bun, o.bun);
	}
	
	@Override
	public String toString() {
		return bun+"\t"+name+"\t"+kor+"\t"+eng+"\t"+
				mat+"\t"+tot+"\t"+ave+"\t"+memo;
	}
	//번호가 같으면 같은 객체로 판단
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu =(Student)obj;
			return bun==stu.bun;
		}else {
			return false;
		}
	}
	public int getBun() {
		return bun;
	}
	public void setBun(int bun) {
		this.bun = bun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAve() {
		return ave;
	}
	public void setAve(double ave) {
		this.ave = ave;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
}
