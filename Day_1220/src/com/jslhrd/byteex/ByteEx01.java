package com.jslhrd.byteex;
// 트 방식 파일 출력
import java.io.*;
public class ByteEx01 {
	public static void main(String[] a) {
		File file = new File("data/abc.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			byte[] by = new byte[1000];
			int count = fis.read(by);
			for(int x=0; x<count; x++) {
				System.out.println(x +":" + (char)by[x]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
