package com.jslhrd.dbexam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.dbsql.EmpSQL;
import com.jslhrd.dbsql.EmpVO;

public class EmpListMain2 {
	public static void main(String[] args) {
		EmpSQL emp = new EmpSQL();
		
		Scanner scn = new Scanner(System.in);
		System.out.print("사원번호:");
		int eno = scn.nextInt();
		
		List<EmpVO> list = emp.getEmpList(eno);
		for(EmpVO vo : list) {
			System.out.print(vo.getEno()+"\t");
			System.out.print(vo.getEname()+"\t");
			System.out.print(vo.getJob()+"\t");
			System.out.print(vo.getHiredate().substring(0,10)+"\t");
			System.out.print(vo.getSalary()+"\n");
		}
	}

}
