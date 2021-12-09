package com.jslhrd.scanner;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class ScannerEx03 {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(new File("input.txt"));
		int cnt=0;
		while(scn.hasNextLine()) {
			scn.nextLine();
			cnt++;
		}
		Student[] student = new Student[cnt];
		scn = new Scanner(new File("input.txt"));
		Student stu = null;
		int nCnt=0;
		for(int x=0; x<cnt; x++) {
			String str[] = scn.nextLine().split(",");
			stu = new Student(Integer.parseInt(str[0]),
						str[1],Integer.parseInt(str[2]),
						Integer.parseInt(str[3]),
						Integer.parseInt(str[4]));
			boolean bool=true;
			for(int y=0; y<nCnt; y++) {
				if(student[y].equals(stu)) {
					bool = false;
					break;
				}
			}
			if(bool) {
				student[nCnt]=stu;
				nCnt++;
			}
		}
		System.out.println("출력 테스트");
		for(int x=0; x<nCnt; x++) {
			System.out.println(student[x]);
		}
	}

}
