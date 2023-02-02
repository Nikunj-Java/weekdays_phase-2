package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Operations {
	
	public static void main(String[] args) {
		Connection conn=DBConfig.getConnection();
		
		try {
			Statement stmt=conn.createStatement();
			
			//create new database 
			stmt.executeUpdate("create database sample");
			System.out.println("Database Created");
			//you can check the same in mysql by query: show databases 
			
			//let's use newly created database;
			stmt.executeUpdate("use sample");
			System.out.println("Database Selected");
			
			//deleting a database
			stmt.executeUpdate("drop database sample");
			System.out.println("Database Removed/Dropped");
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

}
