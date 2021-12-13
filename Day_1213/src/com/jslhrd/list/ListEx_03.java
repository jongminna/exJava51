package com.jslhrd.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx_03 {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("Java");
		list.add("장학생");
		list.add("이학생");
		list.add("강학생");
		list.add("박학생");
		System.out.println(list);
		list.set(0, "윤학생");
		System.out.println(list);
		System.out.println(list.indexOf("이학생"));
		
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
	}

}
