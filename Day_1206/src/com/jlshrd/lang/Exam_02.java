package com.jlshrd.lang;
class AA{
	private int bun;
	private String name;
	private int age;
	AA(int bun, String name, int age){
		this.bun=bun;
		this.name=name;
		this.age=age;
	}
	void print() {
		System.out.println(bun+"\t"+name+"\t"+age);
	}
	@Override
	public String toString() {
		return bun+"\t"+name+"\t"+age;
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		AA a = new AA(1,"AAA",28);
		System.out.println(a.hashCode());
		AA a1 = new AA(1,"AAA",28);
		System.out.println(a1.hashCode());
		//System.out.println(a.bun+"\t"+a.name+"\t"+a.age);
		a.print();
		
	}

}
