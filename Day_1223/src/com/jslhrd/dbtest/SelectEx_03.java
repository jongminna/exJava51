package com.jslhrd.dbtest;
import java.sql.*;
public class SelectEx_03 {
	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="jslhrd51";
		String password="1234";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int dno = 20;//키보드 입력
		String name="SCOTT";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			//String query="select eno,ename,salary,dno "
			//		               + "from employee where dno="+dno;
			String query="select eno,ename,salary,dno "
							               + "from employee where ename='"+name+"'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.print(rs.getInt("eno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getInt("salary")+"\t");
				System.out.print(rs.getInt("dno")+"\n");
			
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
