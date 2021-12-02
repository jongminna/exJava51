package com.jslhrd.abstr;
class ArrayExam extends Array{
	@Override
	void array1() {
		
	}
	@Override
	void array2(int n, int m) {
		
	}
}

class ArrayTest extends Array{
	@Override
	void array1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void array2(int n, int m) {
		// TODO Auto-generated method stub
		
	}
	
}
public class Exam_06 {
	public static void main(String[] args) {
		Array array1 = new ArrayExam();
		array1.test();
		array1.array1();
		array1.array2(1, 5);
		
		Array array2 = new ArrayExam();
		array2.test();
		array2.array1();
		array2.array2(10, 100);
		
	}

}
