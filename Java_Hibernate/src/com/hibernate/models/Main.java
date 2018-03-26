package com.hibernate.models;
import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String ar[])
	{
		try {
				Student student=new Student();
				
				student.setStd_name("Himanshu Saxenaa");
			
				StudentDetail sd=new StudentDetail();
				sd.setStd_mob_no("3245565");
				
				//This is an imp line
				sd.setStd(student);
				
				SessionFactory sf=new Configuration().configure().buildSessionFactory();
				Session session=sf.openSession();
				Transaction tx=session.beginTransaction();
				
				session.save(sd);
				tx.commit();
				
				session.close();

			}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}