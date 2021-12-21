package com.jslhrd.treemap;
import java.util.*;
public class ScoreExam {
	public static void main(String[] args) {
		TreeMap<Student, Score> map = new TreeMap();
		
		map.put(new Student(7,"김학생"), new Score(90,89,77,90));
		map.put(new Student(4,"박학생"), new Score(88,77,88,89));
		map.put(new Student(1,"장학생"), new Score(95,68,97,90));
		map.put(new Student(4,"유학생"), new Score(78,90,89,87));
		map.put(new Student(5,"이학생"), new Score(89,95,78,67));
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t과학\t총점\t평균");
		Set<Student> set = map.keySet();
/*		
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student key = iter.next();
			System.out.println(key+"\t"+map.get(key));
		}
*/		
		for(Student stu: set) {
			System.out.println(stu+"\t"+map.get(stu));
		}
	}

}
