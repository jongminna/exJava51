package com.jslhrd.textex;
//키보드입력 -> 텍스트 출력(outdata.txt)
//입력:번호,이름,국,영,수   -> 총점, 평균
import java.util.*;
import java.io.*;
public class TextEx03 {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(
						new FileWriter(
								new File("data/outdata.txt"))));
		pw.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		while(true) {
			System.out.print("학생등록:");
			String[] str = scn.nextLine().split(",");
			if(str[0].equals("0000"))
				break;
			int tot=Integer.parseInt(str[2])+
					Integer.parseInt(str[3])+
					Integer.parseInt(str[4]);
			double ave=tot/3;
			
			pw.print(str[0]+"\t"+str[1]+str[2]+"\t"+str[3]+"\t"+str[4]+"\t");
			pw.println(tot+"\t"+ave);
			
		}
		pw.close();
	}

}
