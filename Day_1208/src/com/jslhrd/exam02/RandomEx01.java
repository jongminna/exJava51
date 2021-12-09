package com.jslhrd.exam02;

import java.util.Random;

public class RandomEx01 {
	public static void main(String[] args) {
		Random r = new Random(6);
		for(int x=0; x<6; x++) {
			int lotto = r.nextInt(45)+1;
			System.out.println(lotto);
		}
	}

}
