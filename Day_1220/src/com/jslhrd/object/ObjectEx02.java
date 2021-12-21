package com.jslhrd.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ObjectEx02 {
	public static void main(String[] args) throws Exception {
		File f = new File("data/object.txt");
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Object obj = ois.readObject();
		Point p = (Point)obj;
		System.out.print(p);
		ois.close();
	
	}

}
