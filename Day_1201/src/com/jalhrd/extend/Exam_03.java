package com.jalhrd.extend;
class CC{
	int x=100;
	void test() {
		System.out.println("x="+x);
	}
	void print(int x) {
		System.out.println("x="+x);
	}
}
class CCC extends CC{
	int z=300;
	void test(int z) {
		System.out.println("z="+z);
	}
	void print(int x) {//오버라이딩
		System.out.println("x="+x);
	}
	
}

public class Exam_03 {
	public static void main(String[] args) {
		CC cc1 = new CC();
		cc1.test();
		cc1.x=200;
		cc1.test();
		System.out.println("----------------");
		CCC ccc1 = new CCC();
		ccc1.test();
		ccc1.print(1000);
		

	}

}
