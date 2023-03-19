package com.kodnest.ManyToMany.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        
       //Creating object of skill Class
        Language l1 = new Language();
        Language l2 = new Language();
        Language l3 = new Language();
        Language l4 = new Language();
        
        //Storing All Lang in list1
        List<Language> llist1 = new ArrayList<Language>();
        llist1.add(l1);
        llist1.add(l2);
        llist1.add(l3);
        llist1.add(l4);
        //storing English and Hindi in list2
        List<Language> llist2 = new ArrayList<Language>();
        llist2.add(l1);
        llist2.add(l2);
       
        //storing Kannada and Telugu in list3
        List<Language> llist3 = new ArrayList<Language>();
        llist3.add(l3);
        llist3.add(l4);
        
        
        //storing English and Kannada in list4
        List<Language> llist4 = new ArrayList<Language>();
        llist4.add(l1);
        llist4.add(l3);
       
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();


        
        List<Person> plist1 = new ArrayList<Person>();
        plist1.add(p1);
        plist1.add(p2);
        plist1.add(p4);
        
        List<Person> plist2 = new ArrayList<Person>();
        plist2.add(p1);
        plist2.add(p2);
       
        List<Person> plist3 = new ArrayList<Person>();
        plist3.add(p1);
        plist3.add(p3);
        plist3.add(p4);
        
        List<Person> plist4 = new ArrayList<Person>();
        plist4.add(p1);
        plist4.add(p3);
       
        //Assigning values to skill objects
       
        p1.setP_id(11);
        p1.setP_Name("Ankit");
        p1.setL(llist1);
        
        p2.setP_id(12);
        p2.setP_Name("Mohit");
        p2.setL(llist2);
        
        p3.setP_id(13);
        p3.setP_Name("Rohit");
        p3.setL(llist3);
        
        
        p4.setP_id(14);
        p4.setP_Name("Lohit");
        p4.setL(llist4);
        
        ///
        l1.setL_id(01);
        l1.setL_Name("English");
        l1.setP(plist1);
        
        l2.setL_id(02);
        l2.setL_Name("Hindi");
        l2.setP(plist2);
        
        l3.setL_id(03);
        l3.setL_Name("Kannada");
        l3.setP(plist3);
        
        l4.setL_id(04);
        l4.setL_Name("Telugu");
        l4.setP(plist4);
        
      
        Session ss = factory.openSession();
        org.hibernate.Transaction tran = ss.beginTransaction();
        
        //Saving the objects in table
        ss.save(p1);
        ss.save(p2);
        ss.save(p3);
        ss.save(p4);
        ss.save(l1);
        ss.save(l2);
        ss.save(l3);
        ss.save(l4);
        tran.commit();
    }
}
