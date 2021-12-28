package com.jslhrd.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTable {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jslhrd51", "1234");
			System.out.println("커넥션 : " + conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String sql = "create table tbl_city_002(\r\n" + 
				"    city char(2) primary key,\r\n" + 
				"    cityname char(6)\r\n" + 
				")";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
