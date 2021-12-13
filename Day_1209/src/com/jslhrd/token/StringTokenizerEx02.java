package com.jslhrd.token;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {
	public static void main(String[] args) {
		
		String student="1,aaa 90,89 80";
		StringTokenizer st = new StringTokenizer(student,", ");
		//int count = st.countTokens();
		//System.out.println("token :" + count);
		while(st.hasMoreTokens()) {
			int bun = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			int k = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
		}
		
	}

}
