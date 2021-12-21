package com.jslhrd.set;
public class Person {
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p=(Person)obj;
			return p.name.equals(name);
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return name+"\t"+age;
	}
}
