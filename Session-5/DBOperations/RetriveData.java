package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {

	
	public static void main(String[] args) throws SQLException {
		
		Connection conn=DBConfig.getConnection();
		
			Statement stmt=conn.createStatement
					(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
			
			String query="select * from product";
			ResultSet result=stmt.executeQuery(query);
			
			while(result.next()) {
				System.out.println("------------------------");
				System.out.println("Id: "+result.getInt(1));
				System.out.println("Name: "+result.getString("name"));
				System.out.println("Price: "+result.getInt(3));
				//System.out.println("Date: "+result.getDate(4));
				System.out.println("-------------------------");
			}
			
		 
	}
}
