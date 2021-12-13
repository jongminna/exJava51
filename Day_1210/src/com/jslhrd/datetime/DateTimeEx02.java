package com.jslhrd.datetime;

import java.util.Calendar;

public class DateTimeEx02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;//0 ~ 11
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int am = cal.get(Calendar.AM_PM);
		int week = cal.get(Calendar.DAY_OF_WEEK);//1->일, 2->월
		System.out.println("년월일 :" + year+"-"+month+"-"+day);
		System.out.println("시간 :" + am+ "," +hour+":"+minute+":"+second);
		System.out.println("요일:" + week);
		if(am==Calendar.AM) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		
	}

}
