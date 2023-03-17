package com.kodnest.oneToMany.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

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
        
       //Creating object of skill Class
        Skills sk1 = new Skills();
        Skills sk2 = new Skills();
        Skills sk3 = new Skills();
        Skills sk4 = new Skills();
        
        //Storing java and python in list1
        List<Skills> list1 = new ArrayList<Skills>();
        list1.add(sk1);
        list1.add(sk2);
        
        //storing SQL and web in list2
        List<Skills> list2 = new ArrayList<Skills>();
        list2.add(sk3);
        list2.add(sk4);
       
        
        //Creating student object
        Student st1 = new Student(13, "Mohan", list1);
        Student st2 = new Student(14, "Ankit", list2);
        
        //Assigning values to skill objects
        sk1.setSkill_id(111);
        sk1.setSkill_name("Java");
        sk1.setSt(st1);
        
        sk2.setSkill_id(222);
        sk2.setSkill_name("Python");
        sk2.setSt(st1);
        
        sk3.setSkill_id(333);
        sk3.setSkill_name("SQL");
        sk3.setSt(st2);
        
        sk4.setSkill_id(444);
        sk4.setSkill_name("Web");
        sk4.setSt(st2);
        
      
        Session ss = factory.openSession();
        org.hibernate.Transaction tran = ss.beginTransaction();
        
        //Saving the objects in table
        ss.save(st1);
        ss.save(st2);
        ss.save(sk1);
        ss.save(sk2);
        ss.save(sk3);
        ss.save(sk4);
        tran.commit();
    }
}
