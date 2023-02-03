package com.simplilearn.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class StoredProcedureExample {
	
	/*
	 Stored Procedure is  a query to be written in database
	 query:
	 create procedure add_product(IN pname varchar(100),IN pprice int) insert into product(name,price) values(pname,pprice);
	 //call add_product('demolaptopm',54000);
	 */

	
	public static void main(String[] args) throws SQLException {
		
		Connection conn=DBConfig.getConnection();
		
		CallableStatement stmt;
		
		stmt=conn.prepareCall("call add_product(?,?)");
		
		stmt.setString(1, "Thinkpad-Lenovo,i11");
		stmt.setInt(2, 125000);
		
		int x=stmt.executeUpdate();
		
		
		if(x>0)
			System.out.println("Data Inserted");
		else
			System.out.println("Error while Inserting Data");
		
		
	}
}
