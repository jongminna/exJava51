package com.jslhrd.listexam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentExam {
	public static void main(String[] args) {
		List<Student> sList = new ArrayList();
		Scanner scn = new Scanner(System.in);
		Student stu = null;
		while(true) {
			System.out.print("입력:");
			String[] str = scn.nextLine().split(",");
			if(str[0].equals("0000"))
				break;
			if(!Pattern.matches("\\d{4}", str[0])) {
				System.out.println("학번입력오류");
				continue;
			}
			stu = new Student(Integer.parseInt(str[0]),str[1],
					Integer.parseInt(str[2]),
					Integer.parseInt(str[3]),
					Integer.parseInt(str[4]));
			if(sList.contains(stu)) {
				System.out.println("이미등록된학생입니다");
				continue;
			}
			sList.add(stu);
		}//while(true)끝
		//Collections.sort(sList);
		//입력자료순 출력
		StudentData sData = new StudentData(sList);
		sData.titlePrint("입력자료순 출력");
		sData.sourceData();
		//번호순으로 출력
		sData.titlePrint("번호순 출력");
		//sData.sortData();// 선택정열(알고리즘)

		sData.titlePrint("번호순 출력");
		sData.collections_sort();// 
	}

}
