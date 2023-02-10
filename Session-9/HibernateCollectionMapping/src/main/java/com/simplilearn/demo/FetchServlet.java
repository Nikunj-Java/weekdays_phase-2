package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/fetch")
public class FetchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		
		Session session=factory.openSession();
		
		//ready to do the transaction
		
		List<EProduct> list=session.createQuery("from EProduct").list();
		
		for(EProduct product: list) {
			out.print("<br>----------------------------------<br>");
			out.print("<b>Id:</b>"+product.getID()+"<br>");
			out.print("<b>Name:</b>"+product.getName()+"<br>");
			out.print("<b>Price:</b>"+product.getPrice()+"<br>");
			out.print("<b>Available From:</b>"+product.getDateAdded()+"<br>");
			out.print("******************<b>COLOR DETAILS</b>*********************"+"<br>");
			
			List<Color> colors=product.getColors();
			
			for(Color c:colors) {
				out.print("<b>Color Name:</b>"+c.getName()+"<br>");
			}
			
			out.print("******************OPERATING SYSTEM*********************"+"<br>");
			
			Set<OS>os=product.getOs();
			
			for(OS o:os) {
				out.print("<b>OS Name:</b>"+o.getName()+"<br>");
			}
			out.print("----------------------------------"+"<br>");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
