package com.jslhrd.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarEx01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("년도 :");
		int year = scn.nextInt();
		System.out.print("월 :");
		int month = scn.nextInt();
		
		Calendar calendar = new GregorianCalendar(year,(month-1),1);
		System.out.println("\t"+year+"년 "+ month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//마지막 날자 구하기(28, 29,30,31)
		int maxday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
		//요일구함(1일, 2월,3수....)
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		for(int x=1; x<week; x++) {
			System.out.print("\t");
		}
		for(int x=1; x<=maxday; x++) {
			if(week<=7) {
				System.out.print(x+"\t");
			}else {
				System.out.println();
				System.out.print(x+"\t");
				week=1;
			}
			week++;
		}
	}
}
