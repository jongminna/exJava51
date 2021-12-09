package com.jlshrd.localinnerclass;

public class Outer {
	private int x=100;
	private int y=200;
	public void disp() {
		class Inner{
			private int a=100;
			private int b=200;
			public void disp_in() {
				System.out.println("x="+x);
				System.out.println("y="+y);
				System.out.println("a="+a);
				System.out.println("b="+b);
			}
		}
		//내부객체 생성
		Inner in = new Inner();
		in.disp_in();
	}
}
