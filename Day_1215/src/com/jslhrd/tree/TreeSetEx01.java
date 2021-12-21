package com.jslhrd.tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Set & TreeSet
public class TreeSetEx01 {
	public static void main(String[] args) {
		Set set = new HashSet();
		for(int x=0; set.size()<6; x++) {
			int num =(int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
		System.out.println("-------------------------");
		Set treeset = new TreeSet();
		for(int x=0; treeset.size()<6; x++) {
			int num =(int)(Math.random()*45)+1;
			treeset.add(num);
		}
		System.out.println(treeset);
		
		
	}

}
