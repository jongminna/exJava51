package com.jslhrd.scanner;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		while(scn.hasNextInt()) {
			System.out.println(scn.nextInt());
		}
		
		
	}

}
