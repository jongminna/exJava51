package com.jalhrd.school;

public class School extends Student{
	int[] score;
	int tot;
	double ave;
	int rank;

	public School() {}
	
	public School(int bun, String name, int score[]) {
		this.bun=bun;
		this.name=name;
		this.score=score;
		totAve();
	}
	private void totAve() {
		for(int x=0; x<score.length; x++) {
			tot += score[x];
		}
		ave=(double)tot/score.length;
	}

	public void dataPrint() {
		System.out.print(bun+"\t"+name+"\t");
		for(int x=0; x<score.length; x++) {
			System.out.print(score[x]+"\t");
		}
		System.out.print(tot+"\t"+ave+"\t"+rank+"\n");
	}
}
