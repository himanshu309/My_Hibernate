package com.ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main1 {

	public static void main(String[] args) {
		StudentAddress stdadd=new StudentAddress();
		stdadd.setStd_add_details("J and K ,India");
	
		Student1 ss=new Student1();
		ss.setStd_name("Himanshu Saxena");
		ss.setStd_add_id(stdadd);
	
		Student1 ss1=new Student1();
		ss1.setStd_name("Pooja Saxena");
		ss1.setStd_add_id(stdadd);
		
		SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(ss1);
		session.save(ss);
		
		tx.commit();
		session.close();
		
		


	}

}
