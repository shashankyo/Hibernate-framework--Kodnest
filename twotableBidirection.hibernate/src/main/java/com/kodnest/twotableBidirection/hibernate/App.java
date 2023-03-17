package com.kodnest.twotableBidirection.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration();
       cfg.configure();
       SessionFactory factory = cfg.buildSessionFactory();
	   	
     	Laptop1 l  = new Laptop1();
		Laptop1 l1 = new Laptop1();
		Laptop1 l2 = new Laptop1();
		

       
       	Student1 s = new Student1(11, "mohith", l);
		Student1 s1 = new Student1(12, "ranjan", l1);
		Student1 s2 = new Student1(13, "pooja", l2);
	
		l.setL_id(1111);
		l.setL_name("Dell");
		l.setSt(s);
		
		l1.setL_id(2222);
		l1.setL_name("HP");
		l1.setSt(s1);
		
		
		l2.setL_id(3333);
		l2.setL_name("LENOVO");
		l2.setSt(s2);
		
	
	
		
		Session ss = factory.openSession();
		org.hibernate.Transaction tran = ss.beginTransaction();
		ss.save(s);
		ss.save(s1);
		ss.save(s2);
	
		ss.save(l);
		ss.save(l1);
		ss.save(l2);
	
		tran.commit();
    }
}
