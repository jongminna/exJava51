package com.jslhrd.testc;
public class Student {
	private int bun;
	private String name;
	private int age;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			this.age=1;
		}else {
			this.age = age;
		}
	}
	public Student() {}
	public Student(int bun, String name, int age) {
		this.bun=bun;
		this.name=name;
		this.age=age;
	}
	
	public void studentPrint() {
		System.out.println(bun+"\t"+name+"\t"+age);
	}
}
