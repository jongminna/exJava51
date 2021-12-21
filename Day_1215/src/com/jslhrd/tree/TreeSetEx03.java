package com.jslhrd.tree;
import java.util.*;
public class TreeSetEx03 {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet();
		treeSet.add(new Person("김사원", 28));
		treeSet.add(new Person("이사원", 33));
		treeSet.add(new Person("박사원", 21));
		treeSet.add(new Person("강사원", 25));
		treeSet.add(new Person("장사원", 27));
		
		System.out.println(treeSet);
		System.out.println("나이가 가장 많은 학생:" +treeSet.last());
		System.out.println("나이가 가장 적은 학생:" +treeSet.first());
		
		Iterator<Person> iter = treeSet.iterator();
		while(iter.hasNext()) {
			Person p = iter.next();
			System.out.println(p);
		}
	}

}
