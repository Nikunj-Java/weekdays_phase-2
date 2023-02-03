package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicInsert {
	public static void main(String[] args) throws SQLException {
		Connection conn=DBConfig.getConnection();
		String query="insert into product (name,price) value (?,?)";
		
		PreparedStatement stmt=conn.prepareStatement(query);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER PRODUCT NAME");
		String name=sc.nextLine();
		System.out.println("ENTER PRODUCT PRICE");
		int price=Integer.parseInt(sc.nextLine());
		
		stmt.setString(1, name);
		stmt.setInt(2, price);
		
		int x=stmt.executeUpdate();
		
		if(x>0)
			System.out.println("Data Inserted successfully, Data:"+name+","+price);
		else
			System.out.println("Error While Uploading Data");
		
		
		
	}

}
