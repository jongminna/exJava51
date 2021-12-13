package com.jslhrd.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx_05 {
	public static void main(String[] args) {
		List<Users> uList = new ArrayList();
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.print("input :");
			String id = scn.next();
			if(id.equalsIgnoreCase("end"))
				break;
			String name = scn.next();
			int age = scn.nextInt();
			Users use = new Users(id,name,age);
			//id중복검사
			boolean bool = true;
			for(int x=0; x<uList.size(); x++) {
				if(use.getId().equals(uList.get(x).getId())) {
					bool = false;
					break;
				}
			}
			if(bool) {
				uList.add(use);
				System.out.println("등록성공");
			}else {
				System.out.println("등록실패");
			}
		}
		System.out.println("전체목록");
		System.out.println(uList);
	}

}
