package com.jslhrd.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx02 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		map.put("D", 500);
		Set<String> set = map.keySet();
		System.out.println(set);
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key);
			System.out.println("Key :" + key + "\tvalue:"+value);
		}

	}

}
