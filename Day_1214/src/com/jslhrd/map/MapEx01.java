package com.jslhrd.map;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {
	public static void main(String[] args) {
		Map map = new HashMap();
		System.out.println(map.isEmpty());
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		map.put("A", 500);
		System.out.println(map);
		System.out.println(map.get("A"));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("F"));
		System.out.println(map.containsValue(200));


		
	}

}
