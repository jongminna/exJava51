package com.jlshrd.lang;

import java.util.Arrays;

public class Exam_04 {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int tmp[] = arr;//공유
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("tmp : " + Arrays.toString(tmp));
		System.out.println("------------------------");		
		
		tmp[0]=100;
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("tmp : " + Arrays.toString(tmp));
		System.out.println("------------------------");
		int arr2[] = arr.clone();//복제
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2: " + Arrays.toString(arr2));
		System.out.println("------------------------");
		arr2[0]=1000;
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2: " + Arrays.toString(arr2));
		
		
	}

}
