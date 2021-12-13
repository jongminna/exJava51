package com.jslhrd.format;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Exam_02 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("day :" + now);
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("day :" + sd.format(now));
		
		LocalDate today = LocalDate.now();
		System.out.println("day :" + today);
		LocalTime time = LocalTime.now();
		System.out.println("day :" + time);
		LocalDateTime daytime = LocalDateTime.now();
		System.out.println("day :" + daytime);
		
	}

}
