package com.jslhrd.list;
import java.util.*;
import java.io.*;
public class StudentExam {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		File file = new File("student.dat");
		List<Student> sList = new ArrayList<Student>();
		if(file.exists()) {
			ObjectInputStream ois = 
					new ObjectInputStream(
							new BufferedInputStream(
									new FileInputStream(file))); 
			sList = (List)ois.readObject();
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
				if(sList.contains(stu)) {
					System.out.println("중복된 학생입니다.");
				}else {
					sList.add(stu);
					System.out.println("등록되었습니다.");
				}
			}else if(menu==2) {
				//전체 출력 작업
				if(sList.size()==0) {
					System.out.println("등록된 자료가 없음");
				}else {
					TreeSet<Student> tree = new TreeSet(sList);
					System.out.println("번호\t이름\t국어\t영어");
					for(Student s : tree) {
						System.out.println(s);
					}
				}
			}else if(menu==3) {
				// 파일 출력 및 종료
				ObjectOutputStream oos = 
						new ObjectOutputStream(
								new BufferedOutputStream(
										new FileOutputStream(file))); 
				oos.writeObject(sList);
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
