package com.jslhrd.exam02;

interface A{
	void test01();
	void test02();
}
interface B{
	void method01();
	void method02();
}

interface AA extends A{
	
}
interface AAA extends AA, B{
	
}
class AB implements A, B{
	@Override
	public void test01() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void test02() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method01() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method02() {
		// TODO Auto-generated method stub
		
	}
}
public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
