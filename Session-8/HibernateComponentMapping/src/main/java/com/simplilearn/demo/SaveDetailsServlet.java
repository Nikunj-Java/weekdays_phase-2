package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@WebServlet("/save")
public class SaveDetailsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		
		String name=req.getParameter("pname");
		String price=req.getParameter("pprice");
		String hdd=req.getParameter("hdd");
		String cpu=req.getParameter("cpu");
		String ram=req.getParameter("ram");
		
		
		ProductParts parts=new ProductParts(hdd,cpu,ram);
		Product product=new Product(name,new BigDecimal(price),parts);
		
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction tx= session.beginTransaction();
		session.save(product);
		
		tx.commit();
		
		session.close();
		
		out.print("Data Added Successfully");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
