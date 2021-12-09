package com.jlshrd.innerclass;

public class Outer {
	int x=100;
	private int y=200;
	private static int z=300;
	public Outer() {}
	public void disp() {
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
	}
	class Inner{
		private int a=1000;
		public void disp_in() {
			System.out.println("x="+x);
			System.out.println("y="+y);
			System.out.println("z="+z);			
			System.out.println("a="+a);			
		}
	}
}

