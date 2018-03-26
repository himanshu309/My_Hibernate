package com.Queries;

import java.util.List;

import org.hibernate.*;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryMain
{
	public static void main(String[] args) 
	{
		Hql q=new Hql();
		
		q.setEmail("himanshuorcks@gmail.com");
		q.setPwd("him@123");
		q.setUname("Himanshu Saxena");
		q.setId(1);
		
		Hql q2=new Hql();
		q2.setEmail("angupta@gmail.com");
		q2.setPwd("kutta@123");
		q2.setUname("Ankur Gupta");
		q2.setId(2);
		
		try {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
			session.save(q2);
			session.save(q);
			
			q=(Hql)session.get(Hql.class,1);
			System.out.print("names Is---->"+q.getUname()+"   and Email Is--->"+q.getEmail());
		
			session.createQuery("update Hql set email="
					+ "'foo2pagal.com'").executeUpdate();		
			tx.commit();
			session.close();
			
			// DISPALYING UPDATED INFORMATION
			q=null;
			session=sf.openSession();
			session.beginTransaction();
			q=(Hql)session.get(Hql.class,1);
			System.out.print("Email After update query---> "+q.getEmail());	
			
			
			//SELECT QUERY WITH WHERE CONDITION
			
			//TypedQuery<Hql> query=session.createQuery("from Hql");
			@SuppressWarnings("unchecked")
			List<Hql> result=session.createQuery("from Hql").getResultList();
			
			for(int i=0;i<result.size();i++)
			{
				System.out.print("Values from List are --->   "+result.toString());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}