package com.jslhrd.scanner;

import java.io.File;
import java.util.Scanner;

public class ScannerEx02 {
	public static void main(String[] args) throws Exception {
		//Scanner scn = new Scanner(new File("c:\\Users\\admin\\data\\input.txt"));
		Scanner scn = new Scanner(new File("c:/Users/admin/data/input.txt"));
		System.out.println("번호\t이름\t국어\t영어\t수학");
		int cnt=0;
		while(scn.hasNextLine()) {
			scn.nextLine();
			cnt++;
		}
		String student[] = new String[cnt];
		scn = new Scanner(new File("c:/Users/admin/data/input.txt"));
		//배열에 저장
		for(int x=0; x<cnt; x++) {
			student[x]=scn.nextLine();
		}
		//출력
		System.out.println("번호\t이름\t국어\t영어\t수학");
		for(int x=0; x<cnt; x++) {
			System.out.println(student[x]);
		}
		
		
	}

}
