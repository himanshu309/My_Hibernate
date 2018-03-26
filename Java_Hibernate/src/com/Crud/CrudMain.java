package com.Crud;

import org.hibernate.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CrudMain 
{

	public static void main(String[] args) 
	{
		
		BasicCrud c=new BasicCrud();
		c.setName("Himanshu Saxena");
		c.setPassword("himanshu@123");
		
		SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		
		 Transaction tx = session.beginTransaction();
		 c.setName("Hiamnshu before save function");
	     c.setPassword("before");
		 
		 session.save(c);
		 c.setName("Himanshu after save function");
c.setPassword("after");
		 
		// c=(BasicCrud)session.get(BasicCrud.class,1);
		// System.out.print("Fetched Values are-------->"+c.getName()+"\t"+c.getPassword());
		 
		 //c.setName("Mia Khalifa ohh");
		 //session.update(c);
		 
		// c=session.get(BasicCrud.class,1);
		 //System.out.print("Updated Values are ------->"+c.getName());
		 
		// session.delete(c);
			
		 tx.commit();
			session.close();
			
	}
}
