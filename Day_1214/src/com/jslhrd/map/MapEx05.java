package com.jslhrd.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx05 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
		map.put("김학생", 95);	map.put("신학생", 100);
		map.put("이학생", 88);	map.put("오학생", 88);
		map.put("박학생", 78);	map.put("장학생", 55);
		map.put("강학생", 88);	map.put("유학생", 75);
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry entry = (Map.Entry)iter.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		//이름만 출력
		Set nameSet = map.keySet();
		System.out.println("명단:" + nameSet);
		//점수만
		Collection values = map.values();
		System.out.println("점수:" + values);
		iter = values.iterator();
		int tot=0;
		while(iter.hasNext()) {
			int score = (int)iter.next();
			tot+=score;
		}
		System.out.println("총점 :" + tot);
		System.out.println("평균 :" + tot/map.size());
		System.out.println("최고점 :" + Collections.max(values));
		System.out.println("최저점 :" + Collections.min(values));
		
	}

}
