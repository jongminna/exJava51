package com.jslhrd.exam01;
//상수, 리터럴(값 1,2,3 'A',)
public interface InterExam01 {
	int MAX=100;
	void method();
	int method_01(int x, int y);
	
	//jdk1.8추가
	default void test() {
		
	}
	static int sum(int a, int b) {
		
		return 0;
	}
}
