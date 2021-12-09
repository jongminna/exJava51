package com.jslhrd.string;

public class exConcat {
	public static void main(String[] a) {
		String str="";
		for(int x=0; x<10; x++) {
			str += x;
		}
		System.out.println(str);

		String str1="";
		for(int x=10; x>0; x--) {
			str1 = str1.concat(""+x);
		}
		System.out.println(str1);

	}
}
