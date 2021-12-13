package com.jslhrd.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx02 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("중복검사:" + list.contains(40));
		System.out.println("List :" + list);
		System.out.println("-------for()-----------");
		for(int x=0; x<list.size();x++) {
			System.out.print(list.get(x)+"\t");
		}
		System.out.print("\n");
		
		System.out.println("-----확장for()-----------");
		for(Object obj : list) {
			System.out.print(obj+"\t");
		}
		System.out.print("\n");
		
		System.out.println("-----반복자(Iterator)-----------");
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+"\t");
		}
		System.out.print("\n");
	}

}
