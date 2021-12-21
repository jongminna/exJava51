package com.jslhrd.set;

import java.io.*;
import java.util.*;

public class StudentExam {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		File file = new File("studentset.dat");
		TreeSet<Student> sSet = new TreeSet<Student>();
		if(file.exists()) {
			ObjectInputStream ois = 
					new ObjectInputStream(
							new BufferedInputStream(
									new FileInputStream(file))); 
			sSet = (TreeSet)ois.readObject();
		}
		while(true) {
			System.out.println("[1]학생등록");
			System.out.println("[2]전체출력");
			System.out.println("[3] 종료");

			System.out.print("선택(1 ~ 3) ?");
			int menu = System.in.read()-48;
			System.in.read();
			System.in.read();
			if(menu==1) {
				//입력작업
				System.out.print("학생등록:");
				String[] str = scn.nextLine().split(",");
				Student stu = 
						new Student(Integer.parseInt(str[0]),
								str[1],Integer.parseInt(str[2]),
								Integer.parseInt(str[3]),
								Integer.parseInt(str[4]));
				if(sSet.add(stu)) {
					System.out.println("등록성공");
				}else{
					System.out.println("중복");
				}
				
			}else if(menu==2) {
				//전체 출력 작업
				if(sSet.size()==0) {
					System.out.println("등록된 자료가 없음");
				}else {
					System.out.println("번호\t이름\t국어\t영어");
					for(Student s : sSet) {
						System.out.println(s);
					}
				}
			}else if(menu==3) {
				// 파일 출력 및 종료
				ObjectOutputStream oos = 
						new ObjectOutputStream(
								new BufferedOutputStream(
										new FileOutputStream(file)));
				
				oos.writeObject(sSet);
				oos.close();
				System.out.println("프로그램이 종료합니다");
				System.exit(1);
			}else {
				System.out.println("메뉴 선택오류");
				continue;
			}
		}
	}

}
