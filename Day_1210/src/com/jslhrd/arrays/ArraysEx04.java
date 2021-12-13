package com.jslhrd.arrays;

import java.util.Arrays;
public class ArraysEx04 {
	public static void main(String[] args) {
		int score[] = {10,20,30,40,50,60,70,80};
		int index = Arrays.binarySearch(score, 65);
		System.out.println(index);
	}

}
