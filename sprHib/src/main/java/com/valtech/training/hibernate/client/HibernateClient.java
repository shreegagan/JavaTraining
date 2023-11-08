package com.valtech.training.hibernate.client;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.valtech.training.hibernate.Account;
import com.valtech.training.hibernate.Address;
import com.valtech.training.hibernate.AtmTx;
import com.valtech.training.hibernate.BankAccount;
import com.valtech.training.hibernate.BankAccountId;
import com.valtech.training.hibernate.ChequeTx;
import com.valtech.training.hibernate.Customer;
import com.valtech.training.hibernate.Employee;
import com.valtech.training.hibernate.Registration;
import com.valtech.training.hibernate.TellerTx;
import com.valtech.training.hibernate.Tx;


public class HibernateClient {

	public static void main(String[] args) throws Exception {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Employee.class);
		
		cfg.addAnnotatedClass(Tx.class).addAnnotatedClass(ChequeTx.class).addAnnotatedClass(TellerTx.class).addAnnotatedClass(AtmTx.class);
		
		cfg.addAnnotatedClass(Customer.class).addAnnotatedClass(Address.class);;
		
		cfg.addAnnotatedClass(Account.class).addAnnotatedClass(Tx.class);;
		cfg.addAnnotatedClass(Registration.class);
		cfg.addAnnotatedClass(BankAccount.class);
		
		SessionFactory sesFac =cfg.buildSessionFactory();
		Session ses= sesFac.openSession();
		Transaction tx =ses.beginTransaction();
		
		ses.persist(new BankAccount(new BankAccountId("SB",1),30000));
		
		BankAccountId id = new BankAccountId("SB",1);
		BankAccount ba = (BankAccount) ses.load(BankAccount.class, id);
		
//		Account acc =new Account(2000,"CB");
//		Tx tx1=new Tx(2000);
//		Tx tx2= new ChequeTx(12000,1234,1213);
//		Tx tx3 = new TellerTx(9000,123,789);
//		Tx tx4 = new  AtmTx(13000,123);
//		
//		Account acc1= new Account(3000,"CA");
//		Tx tx5= new ChequeTx(11000,1234,1213);
//		
//		
//		Customer cus1= new Customer("def",27);
//		Address add1= new Address("BEL","blr",12131);
//		
//		Customer cus2= new Customer("xyz",21);
//		Address add2= new Address("Hebbal","blr",12111);
//
//		Customer cus =new Customer("Gagan",23);
//		ses.save(cus);
//		Address add= new Address("Utangi","blry",12312);
//		add.setCustomer(cus);
//		ses.save(add);
//		
//		ses.persist(acc);
//		ses.persist(tx1);
//		ses.persist(tx2);
//		ses.persist(tx3);
//		ses.persist(tx4);
//		
//		ses.persist(acc1);
//		ses.persist(tx5);
//		ses.persist(cus1);
//		ses.persist(cus2);
//		
//		ses.persist(add1);
//		ses.persist(add2);
//		
//		cus1.setAddress(add1);
//		add1.setCustomer(cus1);
//		cus2.setAddress(add2);
//		add2.setCustomer(cus2);
//		
//		
//		acc.addTx(tx1);
//		acc.addTx(tx2);
//		acc.addTx(tx3);
//		acc.addTx(tx4);
//		
//		acc1.addTx(tx5);
//		acc1.addCustomer(cus2);acc1.addCustomer(cus);
//		acc.addCustomer(cus1);acc.addCustomer(cus2);acc.addCustomer(cus);
//		
		
		
		
	

		
		
//		ses.save(new Tx(5000));
//		ses.save(new ChequeTx(6000,1234,1213));
//		ses.save(new TellerTx(7000,123,789));
//		ses.save(new AtmTx(8000,123));
//		
//		QUERY LANGUAGE
		
//		ses.createQuery("SELECT DISTINCT tx.account FROM Tx tx").list().forEach(t->System.out.println(t));
		
//		org.hibernate.Query query=ses.createQuery("SELECT DISTINCT c FROM  Customer c join c.accounts a join a.txs t where t.amount>?");
//		
//		query.setFloat(0,3000);
//		query.list().forEach(t->System.out.println(t));
		
	Query query=ses.getNamedQuery("Tx.findAllByCityAndAmountGreaterThan");
	query.setString(0, "blry");
	query.setFloat(1,1000);
	query.list().forEach(t->System.out.println(t));
	
		
		
//		ses.createQuery("SELECT t FROM Tx t join t.accounts.customers c where c.address.city=? AND t.amount>?");
////		
//		
//		query.setFloat(1, 1000);
//		query.list().forEach(t->System.out.println(t));
		
//		int id=(Integer)ses.save(new Employee("Gagan",df.parse("12-10-2001"),30000,'M',false));
//		ses.persist(new Employee(4,"Gagan",LocalDate.of(2001, 10, 21),70000,'M',false));
		
		
//		Employee Related code
//		Employee e=(Employee)ses.get(Employee.class,2);
//		System.out.println(e.getClass().getName());
//		e.setName("kruthik");
		
		tx.commit();
		ses.close();
		sesFac.close();
		
	}
}