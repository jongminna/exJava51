package com.jslhrd.file;
import java.io.*;
public class FileEx02 {
	public static void main(String[] args) {
		File f = new File("c:/users/admin/data");
		if(!f.exists()) {
			f.mkdir();
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		File f1 = new File(f,"abc.txt");
		if(!f1.exists()) {
			try {
				f1.createNewFile();
				System.out.println("파일이 생성되었습니다");
			}catch(Exception e) {}
		}
		if(f1.canWrite()) {
			f1.setReadOnly();
		}
	}

}
