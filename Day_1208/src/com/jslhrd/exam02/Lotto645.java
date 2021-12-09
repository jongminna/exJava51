package com.jslhrd.exam02;

import java.util.Arrays;

public class Lotto645 {
	public static void main(String[] args) {
		int[] Lotto = new int[6];
		for(int x=0; x<Lotto.length; x++){
			Lotto[x] = (int)(Math.random()*45)+1;
		}

		System.out.println(Arrays.toString(Lotto));
		int[] Lotto2 = new int[6];
		for(int x=0; x<Lotto2.length; x++){
			Lotto2[x] = (int)(Math.random()*45)+1;
			for(int y=0; y<x; y++) {
				if(Lotto2[x]==Lotto2[y]) {
					x--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(Lotto2));
	}
}
