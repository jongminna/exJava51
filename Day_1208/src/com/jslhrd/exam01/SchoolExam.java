package com.jslhrd.exam01;

import java.util.Scanner;

public class SchoolExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student[] student = new Student[10];
		int cnt=0;
		Student stu = null;
		while(cnt<10) {
			System.out.print("등록:");
			String str[] = scn.nextLine().split(",");
			if(str[0].equals("0"))
				break;
			stu = new Student(Integer.parseInt(str[0]),
					str[1],Integer.parseInt(str[2]),
					Integer.parseInt(str[3]),
					Integer.parseInt(str[4]));
			//동일 객체 비교
			boolean bool=true;
			for(int x=0; x<cnt; x++) {
				if(stu.equals(student[x])) {
					System.out.println("등록된 학생입니다.");
					bool = false;
					break;
				}
			}
			if(bool) {
				student[cnt] = stu;
				cnt++;
			}
		}
		//출력 테스트
		System.out.println("번호\t이름\t국어");
		for(int x=0; x<cnt; x++) {
			System.out.println(student[x]);
		}
	}

}
