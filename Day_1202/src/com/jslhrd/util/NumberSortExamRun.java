package com.jslhrd.util;

import java.util.Scanner;

public class NumberSortExamRun {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] number = new int[100];
		int cnt=0;
		System.out.print("정수입력:");
		for(cnt=0; cnt<100; cnt++) {
			int s = scn.nextInt();
			if(s==0)
				break;
			//number[cnt] = scn.nextInt();
			//if(number[cnt]==0)
			//	break;
			number[cnt] = s;
		}
		NumberSort ns = new NumberSortExam(number,cnt);
		//NumberSort ns = new NumberSortExam(number,cnt-1);
		ns.dataPrint();
		ns.ascSort();
		ns.descSort();
		//int s = ns.maxMinTotla();
		//System.out.println("합계:" + s);
		System.out.println("합계:" + ns.maxMinTotla());
	}

}
