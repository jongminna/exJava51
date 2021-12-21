package com.jslhrd.tree;
import java.util.*;
import java.util.regex.Pattern;
public class SawonExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		TreeSet<Sawon> treeSet = new TreeSet();
		Sawon sawon = null;
		while(true) {
			System.out.print("사원등록:");
			String[] str = scn.nextLine().split(",");
			if(str[0].equals("0000"))
				break;
			if(!Pattern.matches("\\d{4}", str[0])) {
				System.out.println("사원번호입력오류");
				continue;
			}
			sawon = new Sawon(Integer.parseInt(str[0]),
					str[1],str[2],str[3]);
			if(!treeSet.add(sawon)) {
				System.out.println("이미 등록된 사원입니다.");
				continue;
			}
		}//while()끝
		sawon = new Sawon(1101,"aaa","f","20201101");
		boolean bool = treeSet.contains(sawon);
		System.out.println(bool);
		//출력
		System.out.println("번호\t이름\t성별\t생년월일\t나이");
		Iterator<Sawon> iter = treeSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
