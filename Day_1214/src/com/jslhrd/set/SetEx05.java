package com.jslhrd.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetEx05 {
	public static void main(String[] args) {
		Set set = new HashSet();
		//Set set = new LinkedHashSet();
		for(int x=0; set.size()<6; x++) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}
		
		System.out.println(set);
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
	}

}
