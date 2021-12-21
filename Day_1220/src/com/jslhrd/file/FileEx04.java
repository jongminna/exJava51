package com.jslhrd.file;
import java.io.*;
public class FileEx04 {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println("현재 경로 :" + path);
		File file = new File(path);
		String[] fList = file.list();
		for(String str : fList) {
			System.out.println(str);
		}
		
	}

}
