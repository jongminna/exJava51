package com.jalhrd.extend;
class A{
	int a=10;
//	void method() {
//		System.out.println("a="+a);
//	}
}
class AA extends A{
	int a=20;
	void method() {
		System.out.println("a="+a);
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.a=100;
		//a1.method();
		
		AA aa1 = new AA();
		aa1.method();
	}

}
