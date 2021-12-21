package com.jslhrd.treemap;
import java.util.*;
public class TreeMapEx01 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap();
		scores.put(new Integer(87), "홍학생");
		scores.put(new Integer(98), "박학생");
		scores.put(new Integer(77), "장학생");
		scores.put(new Integer(75), "강학생");
		scores.put(new Integer(80), "이학생");
		scores.put(new Integer(70), "윤학생");
		System.out.println(scores);
		Set<Integer> setKey = scores.keySet();
		for(Integer key: setKey) {
			System.out.println(key + ":" + scores.get(key));
		}
		
		Map.Entry entry = null;
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 :" + entry.getKey() + 
				                            ":"+entry.getValue());
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 :" + entry.getKey() + 
                ":"+entry.getValue());
		
		entry = scores.lowerEntry(90);
		System.out.println("90점 아래 점수 :" + entry.getKey() + 
                ":"+entry.getValue());
		
		entry = scores.higherEntry(90);
		System.out.println("90점 위 점수 :" + entry.getKey() + 
                ":"+entry.getValue());
		
		entry = scores.floorEntry(90);
		System.out.println("90점 이거나 위 점수 :" + entry.getKey() + 
                ":"+entry.getValue());

		entry = scores.ceilingEntry(90);
		System.out.println("90점 이거나 아래 점수 :" + entry.getKey() + 
                ":"+entry.getValue());
		System.out.println("-------------------------");
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() +":" +entry.getValue() + 
					"남은 객체 수:"+scores.size());
		}
		
	}
}
