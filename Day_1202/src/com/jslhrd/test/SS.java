package com.jslhrd.test;

public class SS {
	int x=100;
	protected int y=200;
	
	void test1() {
		System.out.println("SS.x="+x);
		System.out.println("SS.y="+y);
	}
	protected void test2() {
		System.out.println("SS.y="+y);
	}
	
}

