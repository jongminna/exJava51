package com.jslhrd.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableEx01 {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable();
		map.put("김학생", 90);
		map.put("이학생", 89);
		map.put("박학생", 79);
		map.put("장학생", 95);
		map.put("강학생", 88);
		map.put("윤학생", 77);
		System.out.println(map);
		Set set = map.keySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			String name = (String)iter.next();
			int score = map.get(name);
			System.out.println(name + ":" + score);
		}
	}

}
