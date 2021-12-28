package com.jslhrd.shop.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.shop.dao.MemberDAO;
import com.jslhrd.shop.model.MemberVO;

public class MemberJoin {
	public static void main(String[] args) {
		MemberDAO dao = MemberDAO.getInstance();
		
		Scanner scn = new Scanner(System.in);
		MemberVO mem = null;
		
		while(true) {
			System.out.print("번호:");
			int custno = scn.nextInt();
			if(custno==0)
				break;
			System.out.print("이름:");
			String custname = scn.next();
			System.out.print("전화:");
			String phone = scn.next();
			System.out.print("성별:");
			String gender = scn.next();
			System.out.print("가입일자:");
			String joindate = scn.next();
			System.out.print("고객등급:");
			String grade = scn.next();
			System.out.print("거주도시:");
			String city = scn.next();
			
			mem = new MemberVO();
			mem.setCustno(custno);
			mem.setCustname(custname);
			mem.setPhone(phone);
			mem.setGender(gender);
			mem.setJoindate(joindate);
			mem.setGrade(grade);
			mem.setCity(city);

			int row = dao.memberWrite(mem);
			if(row==1) {
				System.out.println("등록성공");
			}else {
				System.out.println("등록실패");
			}
		}
		
		//전체 출력
		List<MemberVO> list = dao.memberList();
		System.out.println("번호\t이름\t연락처\t\t성별\t가입일자\t\t등급\t도시");
		for(MemberVO vo  : list) {
			System.out.print(vo.getCustno()+"\t");
			System.out.print(vo.getCustname()+"\t");
			System.out.print(vo.getPhone()+"\t");
			System.out.print(vo.getGender()+"\t");
			System.out.print(vo.getJoindate()+"\t");
			System.out.print(vo.getGrade()+"\t");
			System.out.print(vo.getCity()+"\n");
		}
	}

}
