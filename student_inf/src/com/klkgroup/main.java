package com.klkgroup;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String[] args) {
		//configuring cfg 
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//open session factory and session
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		//transient state
		student ob1=new student();
		ob1.setStudent1_name("saikumar");
		ob1.setStudent_age(21);
		//persistence state
		Transaction tx=session.beginTransaction();
		session.save(ob1);
		tx.commit();
	    //detached state
		session.close();

	}

}
