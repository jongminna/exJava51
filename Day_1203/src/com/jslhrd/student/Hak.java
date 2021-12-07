package com.jslhrd.student;

public class Hak {
	int bun;	//번호
	String name;//이름
	int score;//점수
	
	public Hak(int bun, String name, int score) {
		this.bun=bun;
		this.name=name;
		this.score=score;
	}
	public void hakPrint() {
		System.out.println(bun+"\t"+name+"\t"+score);
	}
}
