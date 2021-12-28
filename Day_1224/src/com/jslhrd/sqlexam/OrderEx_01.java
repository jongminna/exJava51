package com.jslhrd.sqlexam;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jslhrd.util.DBConn;

public class OrderEx_01 extends DBConn {
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	public void selectOrder() throws Exception {
		String sql="select eno,ename,salary,dno from employee "
				+ "order by salary desc, ename";
		//makeConn();
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println("AAAA");
		}
	}
	
	//이름이 E로 시작하는 사원 검색
	public void nameSelect(String name) throws Exception{
		String sql="select * from employee where "
				+ "ename like ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name+"%");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("ename"));
		}
	}
	
	@Override
	public void clean() throws Exception {
		rs.close();
		pstmt.close();
	}
	//문제 1
	public void exam_01() throws Exception {
	
	}
	
	//문제2
	
}
