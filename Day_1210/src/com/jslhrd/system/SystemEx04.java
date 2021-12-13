package com.jslhrd.system;

public class SystemEx04 {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String path = System.getProperty("user.dir");
		System.out.println("OS :" + osName);
		System.out.println("userName :" + userName);
		System.out.println("userHome :" + userHome);
		System.out.println("path :" + path);
	
	}

}
