package com.jlshrd.innerclass;
public class Exam_01 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.x=200;
		//outer.disp();
		Outer.Inner oix = outer.new Inner();
		Outer.Inner oiy = outer.new Inner();
		
		oix.disp_in();
		System.out.println("----------");
		oiy.disp_in();
		
		Outer.Inner oia = new Outer().new Inner();
		Outer.Inner oib = new Outer().new Inner();
		
		//oi.disp_in();
		//oi2.disp_in();
	}

}
