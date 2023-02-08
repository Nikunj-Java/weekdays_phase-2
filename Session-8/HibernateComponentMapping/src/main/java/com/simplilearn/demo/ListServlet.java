package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/fetch")
public class ListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.getSessionFactory();
		
		Session session=factory.openSession();
		
		List<Product>list=session.createQuery("from Product").list();
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		out.print("<b>Product List</b><br>");
		
		for(Product p:list) {
			out.print("<b>Id:"+p.getId()+",Product Name:"+p.getName()+",Price:"+p.getPrice()+"</b><br>");
			
			
			ProductParts parts=p.getParts();
			out.print("HDD: "+parts.getHdd()+"<br>");
			out.print("CPU: "+parts.getCpu()+"<br>");
			out.print("RAM: "+parts.getRam()+"<br>");
			out.print("--------------------------------<br>");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
