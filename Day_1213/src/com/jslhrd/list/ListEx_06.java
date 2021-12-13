package com.jslhrd.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListEx_06 {
	public static void main(String[] args) {
		List<Users> uList = new ArrayList<Users>();
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.print("input :");
			String id = scn.next();
			if(id.equalsIgnoreCase("end"))
				break;
			String name = scn.next();
			int age = scn.nextInt();
			Users use = new Users(id,name,age);
			boolean bool = uList.contains(use);
			if(bool) {
				System.out.println("중복");
			}else {
				uList.add(use);
				System.out.println("성공");
			}
		}
		System.out.println("전체목록");
		System.out.println("번호\t이름\t나이");
		for(Users user : uList) {
			System.out.print(user.getId()+"\t");
			System.out.print(user.getName()+"\t");
			System.out.print(user.getAge()+"\n");
		}
		
		Collections.sort(uList);
		System.out.println("전체목록 번호 오름차순");
		System.out.println("번호\t이름\t나이");
		for(Users user : uList) {
			System.out.print(user.getId()+"\t");
			System.out.print(user.getName()+"\t");
			System.out.print(user.getAge()+"\n");
		}
	}

}
