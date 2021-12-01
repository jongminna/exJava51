package com.jslhrd.sawon;

import java.util.Scanner;

public class SawonExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Sawon sa = null;
		while(SawonData.cnt<10) {
			sa = new Sawon();
			System.out.print("사원등록:");
			sa.setSabun(scn.next());
			if(sa.getSabun().equalsIgnoreCase("0000"))
				break;
			sa.setName(scn.next());
			sa.setPay(scn.nextInt());
			
			sa.payAccount();
			SawonData.sawon[SawonData.cnt]=sa;
			SawonData.cnt++;
		}
		SawonData.dataPrint();
	}

}
