package com.jslhrd.shop.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBManager {
	public static Connection getConnection() {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="jslhrd51";
		String password="1234";
	
		Connection conn = null;
		try {
			Class.forName(driver);
			//System.out.println("드라이버 로딩");
			conn = DriverManager.getConnection(url, username, password);
			//System.out.println("커넥선 :"+conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void close(Connection conn, PreparedStatement pstmt) {
		try {
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
