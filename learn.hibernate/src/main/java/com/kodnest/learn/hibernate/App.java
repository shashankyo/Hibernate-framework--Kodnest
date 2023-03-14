package com.kodnest.learn.hibernate;

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
    	Teacher t = new Teacher(1001, "prashanth", "sql");
    	Session ss = factory.openSession();
    	org.hibernate.Transaction tran = ss.beginTransaction();
    	ss.save(t);
    	tran.commit();
    }
}
