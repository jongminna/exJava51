package com.jslhrd.string;

import java.util.Scanner;

public class SawonExam {
	public static void main(String[] a) {
		Sawon[] sawon = new Sawon[10];
		Scanner scn = new Scanner(System.in);
		int cnt=0;
		while(cnt<sawon.length) {
			System.out.print("사원등록:");
			String[] input = scn.nextLine().split(",");
			if(input[0].equals("9999"))
				break;
			sawon[cnt] = new Sawon(Integer.parseInt(input[0]),
								input[1],input[2],
								input[3],Integer.parseInt(input[4]));
			cnt++;
		}

		SawonData sData = new SawonData(sawon, cnt);
		System.out.println("번호\t이름\t생년월일\t나이\t성별\t급여");
		sData.sawonPrint();
	}
}
