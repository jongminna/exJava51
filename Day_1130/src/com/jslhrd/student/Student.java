package com.jslhrd.student;
public class Student {
	private String hakbun;//학번
	private String name;//이름
	private String gender;//성별(M:남자/F:여자)
	private int age;//나이
	
	public Student() {}
	public Student(String hakbun,String name, String gender, int age) {
		this.hakbun=hakbun;
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
