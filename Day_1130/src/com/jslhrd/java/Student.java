package com.jslhrd.java;

public class Student {
	String bun;
	String name;
	int age;
	
	Student(){}
	Student(String bun, String name, int age){
		this.bun=bun;
		this.name=name;
		this.age=age;
	}
	void studentPrint() {
		System.out.print(bun+"\t"+name+"\t"+age+"\t");
	}
	void studentPrintln() {
		System.out.println(bun+"\t"+name+"\t"+age);
	}
}
