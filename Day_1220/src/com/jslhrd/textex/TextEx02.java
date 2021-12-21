package com.jslhrd.textex;
import java.io.*;
//텍스트 입출력(Reader/Writer)
public class TextEx02 {
	public static void main(String[] args) {
		File file = new File("data/output.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
/*			while(true) {
				String str = br.readLine();
				if(str==null)
					break;
				System.out.println(str);
			}
*/
			String str="";
			while((str=br.readLine()) != null) {
				System.out.println(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
