package com.kodnest.twotable.hibernate;

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
    	Student s = new Student(11, "mohith");
    	Student s1 = new Student(12, "ranjan");
    	Student s2 = new Student(13, "pooja");

    	Laptop l  = new Laptop(1111, "Hp");
    	Laptop l1 = new Laptop(2222, "Lenovo");
    	Laptop l2 = new Laptop(3333, "Dell");
    	
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
