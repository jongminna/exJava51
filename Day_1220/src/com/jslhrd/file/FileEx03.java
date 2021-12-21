package com.jslhrd.file;
import java.io.*;
//파일 정보 출력
public class FileEx03 {
	public static void main(String[] args) {
		File file = new File("src/com/jslhrd/file/FileEx01.java");
		if(file.exists()) {
			System.out.println("파일명 :" + file.getName());
			System.out.println("파일 경로 :" + file.getPath());
			System.out.println("파일 경로 :" + file.getParent());
			System.out.println("파일 경로(절대경로) :" + file.getAbsolutePath());
			System.out.println("파일 크기:" + file.length()+"bytes");
			System.out.println("최종수정일 :" + 
							new java.util.Date(file.lastModified()));
			
		}else {
			System.out.println(file.getName()+"가 존재하지 않음");
		}
	}

}
