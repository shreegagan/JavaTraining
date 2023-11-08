package com.valtech.training.hibernate.emp;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Embeddable
public class Customer {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cusId;
	private String cusName;
	private int cusPhone;
	private String cusAdress;
	@OneToMany(targetEntity = Order.class,cascade= {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch=FetchType.LAZY,
			mappedBy="customers")
	private Set<Order> orders;
	

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}public Set<Order> getOrders() {
		return orders;
	}


	public Customer( String cusName, int cusPhone, String cusAdress) {
		this.cusName = cusName;
		this.cusPhone = cusPhone;
		this.cusAdress = cusAdress;
	}


	public int getCusId() {
		return cusId;
	}


	public void setCusId(int cusId) {
		this.cusId = cusId;
	}


	public String getCusName() {
		return cusName;
	}


	public void setCusName(String cusName) {
		this.cusName = cusName;
	}


	public int getCusPhone() {
		return cusPhone;
	}


	public void setCusPhone(int cusPhone) {
		this.cusPhone = cusPhone;
	}


	public String getCusAdress() {
		return cusAdress;
	}


	public void setCusAdress(String cusAdress) {
		this.cusAdress = cusAdress;
	}
	
	

}
