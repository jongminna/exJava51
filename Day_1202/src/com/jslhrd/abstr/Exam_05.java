package com.jslhrd.abstr;

abstract class Super{
	int x=10;
	void test() {
		System.out.println("x="+x);
	}
	abstract void sum(int a, int b);
	
}

class Child extends Super{
	int x=100;
	void test() {
		System.out.println("x="+x);
	}
	@Override
	void sum(int a, int b) {
		
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		//Super s = new Super();
		Child c = new Child();
		c.test();
		c.sum(1, 2);
	}

}
