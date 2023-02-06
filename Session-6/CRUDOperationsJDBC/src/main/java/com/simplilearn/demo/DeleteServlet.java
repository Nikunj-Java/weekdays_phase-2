package com.simplilearn.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
		PrintWriter out=resp.getWriter();
		//check the connectivity
		Properties props= new Properties();
		InputStream in=getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
		Connection conn=DBConfig.getConnection(props);
		
		if(conn!=null) {
			PreparedStatement stmt;
			try {
				stmt = conn.prepareStatement("delete from product where id=?");
				String param=req.getParameter("pid");
				int id=Integer.parseInt(param);
				stmt.setInt(1,id);
				
				int x= stmt.executeUpdate();
				
				if(x>0) {
					out.print("Record Deleted Successfully");
					
					resp.sendRedirect("fetch");
				}
				else
				{
					out.print("Error While Deleteing a Data");
				}
			
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
