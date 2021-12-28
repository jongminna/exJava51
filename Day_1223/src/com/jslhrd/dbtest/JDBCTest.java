package com.jslhrd.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("오라클 드라이버 로딩");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="jslhrd51";
		String password="1234";
		
		try {
			Connection conn = 
					DriverManager.getConnection(url, username, password);
			System.out.println("커넥션 : " + conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
