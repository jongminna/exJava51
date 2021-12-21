package com.jslhrd.file;

import java.io.*;

public class FileEx01 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\admin\\data2");
		//File file = new File("C:/Users/admin/data");
		File f2 = new File("data");
/*		if(file.exists()) {
			System.out.println("존재함");
			file.delete();
			try {
				Thread.sleep(3000);
			}catch(Exception e) {}
		}
		System.out.print("폴더생성");
		if(!file.exists()) {
			file.mkdir();
		}
*/
		if(!f2.exists())
			f2.mkdir();
		
	}

}
