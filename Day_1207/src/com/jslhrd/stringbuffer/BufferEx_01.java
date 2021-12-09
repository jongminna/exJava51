package com.jslhrd.stringbuffer;

public class BufferEx_01 {
	public static void main(String[] args) {
		StringBuffer strBuf1 = new StringBuffer();
		StringBuffer strBuf2 = new StringBuffer(10);
		StringBuffer strBuf3 = new StringBuffer("jslhrd");
		System.out.println("문자열 길이 1: " + strBuf1.length());
		System.out.println("문자열 길이 2: " + strBuf2.length());
		System.out.println("문자열 길이 3: " + strBuf3.length());
		
		System.out.println("buffer 길이1 : " + strBuf1.capacity());
		System.out.println("buffer 길이2 : " + strBuf2.capacity());
		System.out.println("buffer 길이3 : " + strBuf3.capacity());

		
	}

}
