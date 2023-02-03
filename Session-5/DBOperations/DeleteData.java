package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
	
	public static void main(String[] args) {
		Connection conn=DBConfig.getConnection();
		//? here is used for dynamic insertion of records
		String sql_query="delete from product where id=?";
		
		try {
			PreparedStatement stmt=conn.prepareStatement(sql_query);
			stmt.setInt(1, 3);
			int x=stmt.executeUpdate();
			if(x>0)
				System.out.println("Record Deleted SuccessFully");
			else
				System.out.println("No Records Available");
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
