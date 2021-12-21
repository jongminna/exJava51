package com.jslhrd.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SetEx03 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("박학생");
		set.add("이학생");
		set.add("김학생");
		set.add("유학생");
		set.add("장학생");
	
		System.out.println(set);
		List list = new ArrayList(set);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
