package com.jslhrd.map;

import java.util.HashMap;
import java.util.Map;

public class MapEx06 {
	public static void main(String[] args) {
		Map<User, Integer> map = new HashMap();
		map.put(new User(1,"aaa"), 88);
		User u = new User(2,"bbb");
		map.put(u, 90);
		u = new User(1,"aaa");
		map.put(u, 99);
		
		System.out.println(map);
	}

}
