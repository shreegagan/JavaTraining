package com.valtech.training.hibernate.client;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.valtech.training.hibernate.emp.Company;
import com.valtech.training.hibernate.emp.Customer;
import com.valtech.training.hibernate.emp.OrderItems;
import com.valtech.training.hibernate.emp.Product;


public class HibernateClient {

	public static void main(String[] args) throws HibernateException, ParseException {
		DateFormat df=new SimpleDateFormat("dd-mm-yyyy");
		//Loads hibernate.properties file 
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		
		cfg.addAnnotatedClass(Company.class).addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(Order.class).addAnnotatedClass(Product.class);
		cfg.addAnnotatedClass(OrderItems.class);
		
		SessionFactory sesFac=cfg.buildSessionFactory();
		Session ses=sesFac.openSession();
		Transaction tx=ses.beginTransaction();
		
		
//		ses.persist(new Customer("Kruthik",1243143105,"bengaluru"));
		
		Customer cus1=new Customer("Kruthik",1243143105,"bengaluru");
//		Address addr1=new Address("JP nagar","Banglore",560070);
		Customer cus2=new Customer("Gagan",1243143105,"bengaluru");
//		Address addr2=new Address("Naampalli","Hyderabad",500080);
//		
		ses.persist(cus1);
		ses.persist(cus2);
//		ses.persist(addr1);
//		ses.persist(addr2);
		
		//IDENTITY insert and then print , TABLE and SEQUENCE first print but not insert and hibernate does when needed 
//		int id=(Integer) ses.save(new Employee("Kruthik",df.parse("04-03-2001"),43105,'M',true));
//		System.out.println(id);
		
		
		tx.commit();
		ses.close();
		sesFac.close();
		
	}
}