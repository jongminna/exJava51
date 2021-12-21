package com.jslhrd.treemap;

public class Score {
	private int kor,eng,mat,edp,tot;
	private double ave;
	public Score(int kor,int eng,int mat,int edp) {
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		this.edp=edp;
		tot=kor+eng+mat+edp;
		ave=tot/4.;
	}
	@Override
	public String toString() {
		return kor+"\t"+eng+"\t"+mat+"\t"+edp+"\t"+tot+"\t"+ave;
	}
}
