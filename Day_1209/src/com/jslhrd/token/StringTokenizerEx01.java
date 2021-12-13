package com.jslhrd.token;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {
	public static void main(String[] args) {
		String test="123,456 aaaa-bbbb";
		StringTokenizer st = new StringTokenizer(test,", -");
		int count = st.countTokens();
		System.out.println("token :" + count);
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			System.out.println(str);
		}
		
	}

}
