package com.jslhrd.test;

public class BBA extends BB {
	int a=20;
	void method() {
		System.out.println("BB.a : " + super.a);
		System.out.println("BBA.a : " + a);
	}

	@Override
	void test() {
		super.test();
		System.out.println("BBA.a : " + a);
	}
	
}
