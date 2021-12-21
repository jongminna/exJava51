package com.jslhrd.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectEx03 {
	public static void main(String[] args) throws Exception {
		List list = new ArrayList();
		list.add("AAAA");		
		list.add(1234);
		list.add(3.14);
		list.add(true);
		
		File f = new File("data/list.txt");
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);

		oos.writeObject(list);
		oos.close();
	}

}
