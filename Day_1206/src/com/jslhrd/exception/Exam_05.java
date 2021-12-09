package com.jslhrd.exception;

import java.io.IOException;

public class Exam_05 {
	public static void main(String[] args) throws Exception {
		System.out.print("x=");
		//try {
			int x = System.in.read()-48;
			System.out.println("x="+x);
		//}catch(IOException e) {
		//	e.printStackTrace();
		//	System.out.println(e.getMessage());
		//}
		
	}

}
