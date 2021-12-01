package com.jslhrd.sawon;

public class SawonData {
	public static Sawon[] sawon = new Sawon[10];
	public static int cnt;//인원수 카운트
	
	public static void dataPrint() {
		System.out.println("사번\t이름\t출장비\t50000\t . . . . ");
		for(int x=0; x<cnt; x++) {
			sawon[x].sawonPrint();
		}
	}
}
