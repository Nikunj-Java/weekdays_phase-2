package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConfig {
	
	public static Connection getConnection(Properties props) {
		
		Connection connection=null;
		String driver=props.getProperty("driver");
		String url=props.getProperty("url");
		String username=props.getProperty("username");
		String password=props.getProperty("password");
		
		//load driver
		try {
			
			Class.forName(driver);
			connection=DriverManager.getConnection(url,username,password);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}

}
