package com.jslhrd.format;

import java.text.DecimalFormat;

public class DecimalFormatEx01 {
	public static void main(String[] a) {
		DecimalFormat df1 = new DecimalFormat("￦0,000.00");
		DecimalFormat df2 = new DecimalFormat("￦#,###.##");
		String s = df1.format(123456789.12567);
		System.out.println(s);
		String s2 = df2.format(123456789.12567);
		System.out.println(s2);
		
	}
}
