package com.jslhrd.stringbuffer;

public class BufferEx_02 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("01");
		System.out.println("sb : " + sb);
		System.out.println("--------------------");
		StringBuffer sb2 = sb.append("23");
		System.out.println("sb : " + sb);
		System.out.println("sb2 : " + sb);
		System.out.println("--------------------");
		sb.append("4").append("56");
		System.out.println("sb : " + sb);
		System.out.println("sb2 : " + sb);
		System.out.println("--------------------");
		StringBuffer sb3 = sb.append(78);
		
		
		
		
	}

}
