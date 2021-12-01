package com.jalhrd.extend;

public class Exam_04 {

	public static void main(String[] args) {
		Super s = new Child();
		//s.method();//x=100
		s.method();
		System.out.println("---------");
		//Child c = new Super();
		Child ch = (Child)s;
		ch.method();
		ch.test();
	}

}
