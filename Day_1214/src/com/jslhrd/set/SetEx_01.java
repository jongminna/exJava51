package com.jslhrd.set;

import java.util.HashSet;
import java.util.Set;

public class SetEx_01 {
	public static void main(String[] args) {
		Set set = new HashSet();
		boolean bool=set.add("Java");
		System.out.println(bool);
		bool=set.add("Java");
		System.out.println(bool);
		set.add("Servlet&JSP");
		set.remove("Java");
		set.add("JSLHRD");
		set.add("Oracle");
		set.add("Mysql");
		System.out.println(set.size());
		System.out.println(set);
		
		set.clear();
		System.out.println(set.size());
		System.out.println(set);
		
		
	}

}
