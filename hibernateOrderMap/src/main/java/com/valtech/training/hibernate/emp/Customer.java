package com.valtech.training.hibernate.emp;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cusId;
	private String name;
	private int phone;

	
	@OneToOne(targetEntity = Address.class, cascade = { CascadeType.MERGE, CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@JoinColumn(name = "addrId", referencedColumnName = "Id")
	private Address address;
	
	@OneToMany(targetEntity = Order.class,cascade= {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch=FetchType.LAZY,
			mappedBy="customer")
	private Set<Order> order;
	
//	@ManyToMany(targetEntity = Account.class,fetch=FetchType.LAZY,mappedBy="customers")
//	private Set<Account> accounts;

	public Customer() {
	}

	

//	public Set<Account> getAccounts() {
//		return accounts;
//	}
//
//	public void setAccounts(Set<Account> accounts) {
//		this.accounts = accounts;
//	}

	public Customer(String name, int phone, Address address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	public int getCusId() {
		return cusId;
	}



	public void setCusId(int cusId) {
		this.cusId = cusId;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}

	
}
