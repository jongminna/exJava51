package com.jslhrd.textex;
import java.io.*;
//텍스트 입출력(Reader/Writer)
public class TextEx01 {
	public static void main(String[] args) {
		File file = new File("data/output.txt");
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println("1. 파일에 쓰기");
			pw.println("2. 파일에 쓰기");
			pw.println("3. 파일에 쓰기");
			pw.println("4. 파일에 쓰기");
			pw.println("5. 파일에 쓰기");
			
			pw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
