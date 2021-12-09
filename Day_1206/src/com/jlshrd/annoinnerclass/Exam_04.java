package com.jlshrd.annoinnerclass;
class Inner{
	public void aaa() {
		System.out.println("aaaaaa");
	}
	public void bbb() {
		System.out.println("bbbbb");
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		Inner in = new Inner();
		in.aaa();
		in.bbb();
		//중첩크래스
		Inner in1 = new Inner() {
			@Override
			public void aaa() {
				System.out.println("aaaaaAAAAA");
			}
			@Override
			public void bbb() {
				System.out.println("bbbbbBBBBB");			}
			//public void ccc() {
			//	System.out.print("ccccc");
			//}
		};
		in1.aaa();
		in1.bbb();
	}

}
