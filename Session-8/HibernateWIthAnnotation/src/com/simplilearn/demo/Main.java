package com.simplilearn.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {

public static void main(String[] args) {
		
		
		StandardServiceRegistry registry= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata=new MetadataSources(registry).getMetadataBuilder().build();
		
		//connection pool
		SessionFactory factory=metadata.getSessionFactoryBuilder().build();
		
		//make sure that you had already prepared table inside the database before executing below code
		Session session= factory.openSession();

		Marks marks=new Marks();
		marks.setName("Nikunj Soni");
		marks.setMy_marks(45);
		marks.setTotal_marks(50);
		
		session.save(marks);
		
		Transaction tx= session.beginTransaction();
		tx.commit();
		
		System.out.println("Session Opened SuccessFully | Data Saved");
		 
		
	}
}
