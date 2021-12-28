package com.jslhrd.dbtest;
import java.sql.*;
public class PreparedStatmentSelectEx_04 {
	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="jslhrd51";
		String password="1234";
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			int dno=10;
			String name="SCOTT";
/*			String query="select eno,ename,salary,dno from employee "
					+ " where dno=?";
*/					
			String query="select eno,ename,salary,dno from employee "
					+ " where ename=?";

			conn = DriverManager.getConnection(url, username, password);
			pstmt = conn.prepareStatement(query);
			//stmt.setInt(1, dno);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
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
				pstmt.close();
				conn.close();
			}catch(Exception e) {}
		}
		
		

	}

}
