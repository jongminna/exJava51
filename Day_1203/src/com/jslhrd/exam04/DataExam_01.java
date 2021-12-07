package com.jslhrd.exam04;

import java.util.Arrays;

public class DataExam_01 {
	public static void main(String[] args) {
		Data data = new DataPro();
		System.out.println("10 30 90 68 97 55 77");
		System.out.println("Max :" + data.getMax(10,30,90,68,97,55,77));
		System.out.println("Min :" + data.getMin(10,30,90,68,97,55,77));
		data.sort(new int[] {10,30,90,68,97,55,77},true);
		data.sort(new int[] {10,30,90,68,97,55,77},false);
		System.out.println("------------------------------------------");
		
		DataArr arr = new DataArrPro();
		int[] score = {10,30,90,68,97,55,77};
		System.out.println("Data : " + Arrays.toString(score));
		System.out.println("Max :" + arr.getMax(10,30,90,68,97,55,77));
		System.out.println("Min :" + arr.getMin(10,30,90,68,97,55,77));
		System.out.println("MaxArr :" + arr.getMinArr(score));
		System.out.println("MinArr :" + arr.getMinArr(score));
		data.sort(score,true);
		data.sort(score,false);
		
		
	}

}
