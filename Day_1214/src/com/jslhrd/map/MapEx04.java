package com.jslhrd.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx04 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap();
		map.put("spring", "123");
		map.put("java", "124");
		map.put("jsl", "134");
		map.put("win", "234");
		
		Scanner scn = new Scanner(System.in);
		System.out.print("아이디 :");
		String id = scn.nextLine();
		System.out.print("비번 :");
		String pass = scn.nextLine();
		if(map.containsKey(id)) {
			if(map.get(id).equals(pass)) {
				System.out.println("Login");
			}else {
				System.out.println("NO pass");
			}
		}else {
			System.out.println("ID NO.....");
		}
		
		
	}

}
