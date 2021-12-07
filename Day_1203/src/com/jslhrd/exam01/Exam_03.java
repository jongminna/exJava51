package com.jslhrd.exam01;

interface Test02{
	void test();
}
/*
class TestExam02 implements Test02{
	@Override
	public void test() {
		System.out.print("AAAA");
	}
	void aaa() {
		
	}
}
*/
public class Exam_03 {
	public static void main(String[] args) {
		//TestExam02 t1  = new TestExam02();
		//Test02 t2 = new TestExam02();
		Test02 t = new Test02() {
			@Override
			public void test() {
				System.out.print("aaaa");
			}
		};
		t.test();
	}

}
