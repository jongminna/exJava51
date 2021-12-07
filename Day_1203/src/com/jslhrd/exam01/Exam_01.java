package com.jslhrd.exam01;

interface Test01{
	int MAX=100;
	void test();
	default void test1() {
		
	}
}

class Car implements Test01{
	int x=10;
	void sample() {
		
	}
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		Test01.super.test1();
	}
	@Override
	public void test() {
		System.out.println("MAX : " + MAX);	
	}
}
class Car1 implements Test01{
	int x=10;
	void sample() {
		
	}
	@Override
	public void test() {
		System.out.println("MAX : " + MAX);	
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		//Test01 test = new Test01();
		Car c1 = new Car();
		c1.sample();
		c1.test();
		System.out.println("----------------");
		Test01 t1 = new Car();
		//t1.sample();
		t1.test();
		
	}

}
