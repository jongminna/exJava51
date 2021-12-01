package com.jalhrd.extend;

public class Super {
	int x=100;
	void method() {
		System.out.println("x="+x);
	}
}

class Child extends Super{
	int x=200;
	void method() {
		super.method();
		System.out.println("bbbb");
	}
	
	void test() {
		System.out.println("aaa : " + super.x);
	}
}

class AAAA extends Child{
	
	void test() {
		super.test();
	}
}
