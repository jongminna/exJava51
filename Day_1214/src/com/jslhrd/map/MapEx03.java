package com.jslhrd.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx03 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		map.put("D", 500);
		
		Set<Map.Entry>set = map.entrySet();
		System.out.println(set);
		Iterator<Map.Entry> iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry entry = iter.next();
			System.out.print(entry.getKey()+":\t");
			System.out.print(entry.getValue()+"\n");
		}
		
	}

}
