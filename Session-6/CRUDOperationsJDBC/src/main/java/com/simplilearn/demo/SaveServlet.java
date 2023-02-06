package com.simplilearn.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class SaveServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		//check the connectivity
				Properties props= new Properties();
				InputStream in=getServletContext().getResourceAsStream("/WEB-INF/application.properties");
				props.load(in);
				
				Connection conn=DBConfig.getConnection(props);
				
		//get the parameters
		PrintWriter out=resp.getWriter();
		String name=req.getParameter("pname");
		BigDecimal price=new BigDecimal(req.getParameter("pprice"));
		
		if(conn!=null) {
			out.print("Connection Established");
			try {
				PreparedStatement stmt=conn.prepareStatement("insert into product (name,price) values (?,?)");
				stmt.setString(1, name);
				stmt.setBigDecimal(2, price);
				
				int x=stmt.executeUpdate();
				if(x>0)
					out.print("Data Inserted Successfully");
				else
					out.print("Error While inserting a Data");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
