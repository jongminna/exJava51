package com.jslhrd.dbtest;
import java.sql.*;
public class SelectEx_02 {
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
			String query="select ename,salary,salary*12+nvl(commission,0) as say "
					+ "from employee";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				String ename = rs.getString("ename");
				int salary = rs.getInt("salary");
				int say = rs.getInt("say");
				System.out.println(ename+"\t"+salary+"\t"+say);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch(Exception e) {}
		}
		
		

	}

}
