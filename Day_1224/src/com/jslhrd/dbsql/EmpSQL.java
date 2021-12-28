package com.jslhrd.dbsql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.util.DBManager;

public class EmpSQL {
	Connection conn = null;
	PreparedStatement pstmt =null;
	ResultSet rs = null;
	//1. 메소드 정의(이름 사원번호)
	public int enoSelect(int eno) {
		String query="select eno, ename from employee "
				+ "where eno=?";
		int row=0;//리턴타입 정의
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, eno);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				row=rs.getInt("eno");
				//System.out.print(row +"\t" + rs.getString("ename"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return row;
	}
	//2. 메소드 정의(번호를 이용한 사원 검색)
	public EmpVO getEmpSelect(int eno) {
		String query="select * from employee "
				+ "where eno=?";
		EmpVO vo =null;//리턴타입 정의
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, eno);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new EmpVO();
				vo.setEno(rs.getInt("eno"));
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setHiredate(rs.getString("hiredate"));
				vo.setSalary(rs.getInt("salary"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return vo;
	}

	//3. 메소드 정의(번호를 이용한 사원 검색)
	public List<EmpVO> getEmpList(int eno) {
		String query="select * from employee "
				+ "where eno>=?";
		List<EmpVO> list = new ArrayList();//리턴타입 정의
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, eno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEno(rs.getInt("eno"));
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setHiredate(rs.getString("hiredate"));
				vo.setSalary(rs.getInt("salary"));
				list.add(vo);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	
	//문제 1
	
	//문제2
	
	
}
