package com.valtech.training.hibernate.client;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.valtech.training.hibernate.emp.Address;
import com.valtech.training.hibernate.emp.Company;
import com.valtech.training.hibernate.emp.Customer;
import com.valtech.training.hibernate.emp.Order;
import com.valtech.training.hibernate.emp.OrderItems;
import com.valtech.training.hibernate.emp.Product;


public class HibernateClient  {

	public static void main(String[] args) throws  ParseException {
		DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
		//Loads hibernate.properties file 
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		
		cfg.addAnnotatedClass(Address.class).addAnnotatedClass(Product.class);
		cfg.addAnnotatedClass(Company.class).addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(Order.class);
//		cfg.addAnnotatedClass(OrderSummaryId.class);
		cfg.addAnnotatedClass(OrderItems.class);
		
		
		SessionFactory sesFac=cfg.buildSessionFactory();
		Session ses=sesFac.openSession();
		Transaction tx=ses.beginTransaction();
		
		Address addr1=new Address("JP nagar","Banglore",560070);
		ses.persist(addr1);
		Company comp1=new Company("valtech",addr1);
		ses.persist(comp1);
		addr1.setCompany(comp1);
		ses.save(addr1);
		
		Address addr2=new Address("BEL","Banglore",560070);
		ses.persist(addr2);
		Customer cus1=new Customer("Kruthik",1243143105,addr2);
		ses.persist(cus1);
		addr2.setCustomer(cus1);
		ses.save(addr2);
	
		
		Product pro1=new Product("Phone",22000.00,comp1);
		ses.persist(pro1);
		
		Order order1= new Order(df.parse("01-01-2023"),cus1);
		ses.persist(order1);
		
//		OrderSummaryId orderSummaryId= new OrderSummaryId(pro1,order1);
//		ses.persist(orderSummaryId);
				
		OrderItems orderItems1=new OrderItems(pro1,order1,4);
		ses.persist(orderItems1);
		
//		OrderItems orderItems1=new OrderItems(orderSummaryId,4);
//		ses.persist(orderItems1);
		
//		ses.persist(addr2);
//		ses.persist(new Customer("Kruthik",1243143105,"bengaluru"));
		
//		
////		Address addr1=new Address("JP nagar","Banglore",560070);
//		Customer cus2=new Customer("Gagan",1243143105,"bengaluru");
//		Address addr2=new Address("Naampalli","Hyderabad",500080);
//		
//		ses.persist(cus1);
//		ses.persist(cus2);
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