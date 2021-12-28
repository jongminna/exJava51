package com.jslhrd.dbtest;
import java.sql.*;
public class SelectEx_01 {
	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="jslhrd51";
		String password="1234";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			String query="select dno,\r\n" + 
					"dname,\r\n" + 
					"loc \r\n" + 
					"from \r\n" + 
					"department";
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.println(rs.getString(3));				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
