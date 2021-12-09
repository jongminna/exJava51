package com.jslhrd.exception;
class AAA{
	String name;
	void print() throws Exception {
		if(name.equals("aaa")) {
			System.out.println("name :" + name);
		}else {
			System.out.println("name : = null");
		}
		//throw new AAA();
	}
}
public class Exam_07 {
	public static void main(String[] args) {
		AAA a = new AAA();
		//a.name="aaa";
		try {
			a.print();
		}catch(Exception e) {
			e.getStackTrace();
		}
	}

}
