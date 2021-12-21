package com.jslhrd.set;

import java.util.HashSet;
import java.util.Set;

public class SetEx06 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet();
		set.add(new Person("김학생",28));
		set.add(new Person("이학생",21));
		set.add(new Person("김학생",22));
		set.add(new Person("박학생",23));
		set.add(new Person("박학생",28));
		set.add(new Person("장학생",24));
		System.out.println(set);
		
		Person p = new Person("김학생", 33);
		System.out.println(set.contains(p));
		
	}

}
