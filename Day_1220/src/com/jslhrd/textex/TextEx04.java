package com.jslhrd.textex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class TextEx04 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(
				new FileReader(
						new File("data/inputdata.txt")));
		StringTokenizer st = null;
		String data = null;
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		while((data=br.readLine())!=null) {
			st = new StringTokenizer(data,", ");
			String bun = st.nextToken();
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int mat = Integer.parseInt(st.nextToken());
			int tot = kor+eng+mat;
			double ave = tot/3;
			System.out.print(bun+"\t"+name+"\t"+kor+"\t");
			System.out.println(eng+"\t"+mat+"\t"+tot+"\t"+ave);
		}
		br.close();
	}

}
