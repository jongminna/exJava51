package com.jslhrd.dbexam;

import java.sql.Connection;

import com.jslhrd.util.DBManager;

public class DBmanagerTest {
	public static void main(String[] args) throws Exception {
		Connection conn = DBManager.getConnection();
		System.out.print(conn);
	}

}
