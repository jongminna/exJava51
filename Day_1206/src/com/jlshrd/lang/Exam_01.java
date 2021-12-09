package com.jlshrd.lang;
class A{
	int x;
}
class B{
	int k;
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof B) {
			B aaa = (B)obj;
			return k==aaa.k;
		}else {
			return false;
		}
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		
		System.out.println("a1==a2 : " + (a1==a2));
		System.out.println("a1.equals(a2) : " + (a1.equals(a2)));
		System.out.println("----------------------");
		B b1 = new B();
		b1.k=100;
		B b2 = new B();
		b2.k=200;
		System.out.println("b1==b2 : " + (b1==b2));
		System.out.println("b1.equals(b2) : " + (b1.equals(b2)));
		
		
	}

}
