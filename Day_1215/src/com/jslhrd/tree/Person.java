package com.jslhrd.tree;

public class Person implements Comparable<Person>{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Person o) {
		return Integer.compare(age, o.age);
	}
	
	@Override
	public String toString() {
		return name+":"+age;
	}
}
