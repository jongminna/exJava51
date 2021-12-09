package com.jslhrd.pattern;

import java.util.regex.Pattern;

public class Exam_02 {
	public static void main(String[] args) {
		String tel="010-10234-1234";
		String pt="(02|010)-\\d{3,4}-\\d{4}";
		String regExp2 = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; 

/*		boolean bool = Pattern.matches(pt, tel);
		if(bool) {
			System.out.println("Pass");
		}else {
			System.out.println("NO");
		}
*/		
		if(Pattern.matches(pt, tel)) {
			System.out.println("Pass");
		}else {
			System.out.println("NO");
		}
	}

}
