package com.jlshrd.lang;
class Person{
	int bun;
	String name;
	int age;
	Person(int bun,String name,int age){
		this.bun=bun;
		this.name=name;
		this.age=age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return bun==p.bun && name.equals(p.name);
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return name.hashCode()+bun;
	}
	@Override
	public String toString() {
		return bun+"\t"+name+"\t"+age;
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		Person p1 = new Person(1,"김학생", 28);
		Person p2 = new Person(1,"김학생", 30);
		System.out.println("같은 객체인가 ?" + (p1==p2));
		System.out.println("같은 객체인가 ?" + p1.equals(p2));
		System.out.println("같은 객체인가 ?" + (p1.hashCode()==p2.hashCode()));
		
	}

}
