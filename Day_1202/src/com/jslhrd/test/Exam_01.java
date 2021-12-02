package com.jslhrd.test;
public class Exam_01 {
	public static void main(String[] args) {
		BB b1 = new BB();
		b1.test();
		int s = b1.sum(1, 10);
		System.out.println("1 ~ 10 합 :" + s);
		System.out.println("-----------------");
		BBA ba = new BBA();
		ba.test();
		ba.method();
		System.out.println("1 ~ 10 합 :" + ba.sum(1, 10));
		System.out.println("-----------------");
		
	}

}
