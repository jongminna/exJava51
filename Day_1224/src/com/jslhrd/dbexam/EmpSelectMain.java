package com.jslhrd.dbexam;

import java.util.Scanner;

import com.jslhrd.dbsql.EmpSQL;
import com.jslhrd.dbsql.EmpVO;

public class EmpSelectMain {
	public static void main(String[] args) {
		EmpSQL emp = new EmpSQL();
		
		Scanner scn = new Scanner(System.in);
		System.out.print("사원번호:");
		int eno = scn.nextInt();
		
		EmpVO vo = emp.getEmpSelect(eno);
		if(vo != null) {
			System.out.println("사원번호 :" + vo.getEno());
			System.out.println("사원이름 :" + vo.getEname());
			System.out.println("업무명 :" + vo.getJob());
			System.out.println("입사일자 :" + vo.getHiredate().substring(0,10));
			System.out.println("급여 :" + vo.getSalary());
		}else {
			System.out.println("NO");
		}
	}

}
