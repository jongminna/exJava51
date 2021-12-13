package com.jslhrd.list;

public class Users implements Comparable<Users>{
	private String id;
	private String name;
	private int age;
	
	public Users(String id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Users o) {
		return id.compareTo(o.id);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Users) {
			Users u =(Users)obj;
			return u.id.equals(id);
		}
		return false;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		this.age = age;
	}
}
