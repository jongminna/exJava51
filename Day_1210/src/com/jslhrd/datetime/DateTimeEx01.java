package com.jslhrd.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeEx01 {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd : a hh시mm분ss초 EEEE");
		String today = sd.format(now);
		System.out.println(now);
		System.out.println(today);
	}

}
