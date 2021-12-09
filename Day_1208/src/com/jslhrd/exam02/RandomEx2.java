package com.jslhrd.exam02;

import java.util.Random;
import java.util.Scanner;

public class RandomEx2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] score = null;
		Random r = null;
		while(true) {
			System.out.print("수치입력(1 ~ ? )");
			int num = scn.nextInt();
			if(num==0)
				break;
			score = new int[num];
			r = new Random();
			for(int x=0; x<100; x++) {
				int var = r.nextInt(num)+1;
				score[var-1]++;
			}
			//출력
			System.out.println("=========결과===========");
			for(int x=0; x<score.length; x++) {
				System.out.print((x+1)+":");
				for(int y=0; y<score[x];y++) {
					System.out.print("*");
				}
				System.out.println("("+score[x]+")");
			}
		}
	}

}
