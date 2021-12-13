package com.jslhrd.arrays;

import java.util.Arrays;

//Arrays
public class ArraySex01 {
	public static void main(String[] args) {
		String str[] = {"aaa","bbb","ccc","ddd","eee"};
		System.out.println("----for()---");
		for(int x=0; x<str.length;x++) {
			System.out.print(str[x]+"\t");
		}
		System.out.println();
		System.out.println("----확장for()---");
		for(String s : str) {
			System.out.print(s+"\t");
		}
		System.out.println();
		
		System.out.println("----Arrays.toString---");
		System.out.print(Arrays.toString(str));
		System.out.println();

	}

}
