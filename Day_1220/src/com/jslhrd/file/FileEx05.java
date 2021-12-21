package com.jslhrd.file;
import java.io.*;
public class FileEx05 {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		File file = new File(path);
		File[] fList = file.listFiles();
		for(int x=0; x<fList.length; x++) {
			if(fList[x].isDirectory()) {
				System.out.println(fList[x].getName()+"\t [Dir]");
				File f = new File(path,fList[x].getName());
				String[] str = f.list();
				for(String s : str) {
					System.out.println("\t" +  s);
				}
				System.out.println();
			}else {
				System.out.println(fList[x].getName() + "[f]");
			}
		}
	}

}
