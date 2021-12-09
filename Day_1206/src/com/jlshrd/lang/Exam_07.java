package com.jlshrd.lang;
public class Exam_07 {
	public static void main(String[] args) {
		String str="Apple".toUpperCase(); //문자열.length();
		//char ch = str.charAt(0);
		System.out.println("문자열 길이 :" + str.length());
		for(int x=0; x<str.length(); x++) {
			char ch = str.charAt(x);
			System.out.println(ch);
		}
				
	}

}
