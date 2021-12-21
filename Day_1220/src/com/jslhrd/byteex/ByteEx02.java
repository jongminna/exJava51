package com.jslhrd.byteex;
// 트 방식 파일 출력
import java.io.*;
public class ByteEx02 {
	public static void main(String[] a) {
		File file = new File("data/abc.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			byte[] data= {66,68,70,72,(byte)'!'};
			fos.write(data);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("실행 끝");
	}
}
