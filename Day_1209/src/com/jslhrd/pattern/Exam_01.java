package com.jslhrd.pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

/*  정규표현식
 *  [] : 한 개의 문자 ->[bac], [a-z0-9A-Z]
 *  \d : 숫자 한 자->[0-9]
 *  \s : 공백
 *  \w : 영문자 , 숫자, 대, 소==[a-z0-9A-Z]
 *  ? : 없음 또는 한 개
 *  * : 없거나 한개 이상
 *  + : 한개 이상
 *  {n} : 최소 n 자리 수
 *  {n,m} : 최소n자리, 최대m자리
 *  () : 그룹핑
 */
public class Exam_01 {
	public static void main(String[] args) {
		//키보드로 정수 3자리
		Scanner scn = new Scanner(System.in);
		System.out.print("정수입력(0~100) :");
		String[] str = scn.nextLine().split(",");
		for(int x=0; x<str.length; x++) {
			//boolean bool = Pattern.matches("\\d{1,3}", str[x]);
			boolean bool = Pattern.matches("\\d+", str[x]);
			if(bool) {
				System.out.println(str[x]);
			}else {
				System.out.println("X");
			}
		}
	}

}
