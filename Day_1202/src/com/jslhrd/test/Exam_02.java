package com.jslhrd.test;
class DD{
	int a;
	DD(int a){
		System.out.println("DD() 생성자가 호출됨 :" +a);
	}
	void test1() {
		System.out.println("DD.test1() 호출");
	}
}
class DDA extends DD{
	int a;
	DDA(){
		super(10);
		System.out.println("DDA() 생성자가 호출됨");		
	}
	DDA(int a){
		super(10);
		System.out.println("DDA() 생성자가 호출됨 :" +a);		
	}
	
	void test2() {
		System.out.println("DDA.test2() 호출");
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		DDA d = new DDA();
		DDA d2 = new DDA(10);
	}

}
