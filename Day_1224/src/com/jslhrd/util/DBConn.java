package com.jslhrd.util;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class DBConn {
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String username="jslhrd51";
	private String password="1234";
	
	protected Connection conn = null;
	
	public DBConn() {}
	public void makeConn() throws Exception {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, username, password);
	}
	
	public abstract void clean() throws Exception ;
	
	public void takeDown() throws Exception {
		clean();
		conn.close();
	}
}
