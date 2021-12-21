package com.jslhrd.set;

import java.util.HashSet;
import java.util.Set;

public class SetEx04 {
	public static void main(String[] args) {
		Set set = new HashSet();
		for(int x=0; set.size()<6; x++) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}
		
		System.out.println(set);
	}

}
