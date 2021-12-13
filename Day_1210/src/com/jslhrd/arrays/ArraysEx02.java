package com.jslhrd.arrays;

import java.util.Arrays;

public class ArraysEx02 {
	public static void main(String[] args) {
		int var[] = {1,2,3,4,5};
		int var2[] = var;
		int score[] = Arrays.copyOf(var, var.length);
		score[1]=1000;
		System.out.println(Arrays.toString(var));
		System.out.println(Arrays.toString(score));
		Arrays.sort(var);
		System.out.println(Arrays.toString(var));
		
	}

}
