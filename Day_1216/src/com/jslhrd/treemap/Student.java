package com.jslhrd.treemap;
public class Student implements Comparable<Student>{
	private int bun;
	private String name;
	public Student(int bun, String name) {
		this.bun=bun;
		this.name=name;
	}
	//번호기준 오름차순 정렬

	public int compareTo(Student o) {
		return Integer.compare(bun, o.bun);
	}
	//출력

	public String toString() {
		return bun +"\t"+name;
	}
}
