package com.jslhrd.lambda;
interface Test{
	void method();
}
class AAA implements Test{
	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
}
public class Ex_01 {
	public static void main(String[] args) {
		AAA aa = new AAA();
		aa.method();
		Test t = new Test() {
			@Override
			public void method() {
				// TODO Auto-generated method stub
				
			}
		};
		t.method();
	}

}
