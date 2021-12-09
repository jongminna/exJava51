package com.jslhrd.exception;
class AA{
	String name;
	void print() {
		try {
			if(name.equals("aaa")) {
				System.out.println("name :" + name);
			}else {
				System.out.println("name : = null");
			}
		}catch(NullPointerException e) {
			//e.printStackTrace();
			System.out.println("예외발생 : " + e.getMessage());
		}finally {
			System.out.println("종료합니다");
		}
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		AA a = new AA();
		a.name="aaa";
		a.print();
	}

}
