package com.ManyToMany;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main2 {

	public static void main(String[] args) 
	{
	StdCertification sf=new StdCertification();
	sf.setCertification_name("OCJAP Certification");
	
	StdCertification sf2=new StdCertification();
	sf2.setCertification_name("Oracle Certification");
	
	Student2 std=new Student2();
	std.setStd_name("Mia khalifa");
	(std.getStdcertification()).add(sf);
	
	Student2 std2=new Student2();
	std2.setStd_name("Mia Khalifa");
	std2.getStdcertification().add(sf2);
	
	
	SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
	Session session=sessionfactory.openSession();
	Transaction tx=session.beginTransaction();
	
	session.save(std);
	session.save(std2);
	tx.commit();
	session.close();
	}

}
