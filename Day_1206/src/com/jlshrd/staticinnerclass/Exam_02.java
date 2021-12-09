package com.jlshrd.staticinnerclass;

public class Exam_02 {
	public static void main(String[] args) {
		Outer ot = new Outer();
		ot.disp();
		//Outer.Inner oi = ot.new Inner();
		Outer.Inner oi = new Outer.Inner();
		oi.disp_in();
		System.out.println("b="+Outer.Inner.b);
	}

}
