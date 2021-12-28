package com.jslhrd.dbexam;

import java.util.Scanner;

import com.jslhrd.dbsql.EmpSQL;

public class enoSelectMain {
	public static void main(String[] args) {
		EmpSQL emp = new EmpSQL();
		
		Scanner scn = new Scanner(System.in);
		System.out.print("사원번호:");
		int eno = scn.nextInt();
		
		int row = emp.enoSelect(eno);
		if(row != 0) {
			System.out.println(eno+"사원은 존재함");
		}else {
			System.out.println(eno+"사원은 없음");
		}
		
	}

}
