package com.jslhrd.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SetEx02 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Korea");
		set.add(1234);
		set.add("김학생");
		set.add(3.141592);
		set.add(false);
		System.out.println("===============set 객체 출력================");
		System.out.println(set);
		
		System.out.println("===============확장 for 출력================");
		for(Object obj : set) {
			System.out.print(obj+"\t");
		}
		System.out.print("\n");
		System.out.println("===============반복자(Iterator)변환 출력================");
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+"\t");
		}
		System.out.print("\n");
		System.out.println("===============List 변환 출력================");
		List list = new ArrayList(set);
		System.out.println(list);
	
		
	}

}
