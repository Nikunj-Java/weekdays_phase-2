package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
	
	public static  Connection getConnection() {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/ecommerce4";
		String user="root";
		String password="Nikunj@123";
		
		
		Connection conn=null;
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			if(conn!=null)
				System.out.println("Connected");
			else
				System.out.println("Error While  Connecting");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return conn;
	}

}
