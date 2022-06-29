package Hibernaet_Basics.Hibernaet_Basics;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
        /* //insert 
    	student s = new student();
    	s.setId(101);
    	s.setFname("abc");
    	s.setLname("xyz");
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(student.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory(reg);
    	Session sess = sf.openSession(); //session start
    	Transaction tx = sess.beginTransaction();
    	
    	sess.save(s);	//insert query
    	tx.commit();*/
    	
    	/* //Select
    	Configuration con = new Configuration().configure().addAnnotatedClass(student.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory(reg);
    	Session sess = sf.openSession(); //session start
    	Transaction tx = sess.beginTransaction();
    	
    	student s = new student();
    	
    	s = (student)sess.get(student.class, 101);
    	sess.save(s);
    	tx.commit();
    	System.out.println(s);*/
    	
    	/* //Select all
    	Configuration con = new Configuration().configure().addAnnotatedClass(student.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory(reg);
    	Session sess = sf.openSession(); //session start
    	Transaction tx = sess.beginTransaction();
    	
    	List student = sess.createQuery("FROM student").list();
    	
    	tx.commit();
    	Iterator it = student.iterator();
    	while(it.hasNext()) {
    		  System.out.println(it.next());
    	}*/
    	
    	/* //Update
    	Configuration con = new Configuration().configure().addAnnotatedClass(student.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory(reg);
    	Session sess = sf.openSession(); //session start
    	Transaction tx = sess.beginTransaction();
    	
    	student s = new student();
    	
    	s = (student)sess.get(student.class, 101);
    	s.setFname("Ani");
    	s.setLname("ABC");
    	sess.update(s);
    	tx.commit();
    	System.out.println(s);*/
    	
    	
    	//Delete
    	Configuration con = new Configuration().configure().addAnnotatedClass(student.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory(reg);
    	Session sess = sf.openSession(); //session start
    	Transaction tx = sess.beginTransaction();
    	
    	student s = new student();
    	
    	s = (student)sess.get(student.class, 101);
    	sess.delete(s);
    	List student = sess.createQuery("FROM student").list();
    	
    	tx.commit();
    	Iterator it = student.iterator();
    	while(it.hasNext()) {
    		  System.out.println(it.next());
    	}
    	
    }
}