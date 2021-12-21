package com.jslhrd.properties;
import java.io.FileReader;
import java.util.Properties;
public class PropertiesEx01 {
	public static void main(String[] args) throws Exception {
		Properties pro = new Properties();
		String path=PropertiesEx01.class.getResource("database.properties").getPath();
		//System.out.println(path);
		pro.load(new FileReader(path));
		String driver = pro.getProperty("driver");
		String url = pro.getProperty("url");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		
		System.out.println("driver :" + driver);
		System.out.println("url :" + url);
		System.out.println("username :" + username);
		System.out.println("password :" + password);
		
		
	}

}
