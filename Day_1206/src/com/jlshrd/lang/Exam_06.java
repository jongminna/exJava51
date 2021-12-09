package com.jlshrd.lang;
class DD{
	
}
public class Exam_06 {
	public static void main(String[] args) {	
		String str1 = "AAAA";
		String str2 = "AAAA";
		String str3 = new String("AAAA");

		System.out.println("str1==str2 : " + (str1==str2));
		System.out.println("str1==str3 : " + (str1==str3));
		System.out.println("str1.equals(str3) : " + (str1.contentEquals(str3)));
	}

}
