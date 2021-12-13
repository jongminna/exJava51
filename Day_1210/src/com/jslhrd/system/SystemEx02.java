package com.jslhrd.system;

public class SystemEx02 {
	public static void main(String[] args) {
		String id="a";
		id = id+System.currentTimeMillis();
		long time = System.currentTimeMillis();
		long time2 = System.nanoTime();
		System.out.println(time);
		System.out.println(time2);
	}

}
