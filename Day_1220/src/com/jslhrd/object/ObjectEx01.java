package com.jslhrd.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//객체 직렬화
class Point implements Serializable{
	int x;
	int y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "x="+x+", y="+y;
	}
}

public class ObjectEx01 {
	public static void main(String[] args) throws Exception {
		File f = new File("data/object.txt");
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		Point p = new Point(100,200);
		oos.writeObject(p);
		
		oos.close();
	
	}

}
