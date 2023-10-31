package com.valtech.training.hibernate.client;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.valtech.training.hibernate.Employee;


public class HibernateClient {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sesFac =cfg.buildSessionFactory();
		Session ses= sesFac.openSession();
		Transaction tx =ses.beginTransaction();
		
		ses.persist(new Employee(3,"kruthik",LocalDate.of(2001, 10, 21),40000,'M',false));
		ses.persist(new Employee(4,"Gagan",LocalDate.of(2001, 10, 21),70000,'M',false));
		
		tx.commit();
		ses.close();
		sesFac.close();
		
	}
}