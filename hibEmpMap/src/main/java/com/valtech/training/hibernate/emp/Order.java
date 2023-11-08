package com.valtech.training.hibernate.emp;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class Order {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private int cusId;
	@Basic() @Temporal(TemporalType.DATE)
	private Date orderDate;
	@ManyToOne(targetEntity = Customer.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, fetch = FetchType.EAGER)
	@JoinColumn(name = "cusId", referencedColumnName = "cusId")
	private Customer customers;
	
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(  Date orderDate) {
		this.orderDate = orderDate;
	}
	public void setCustomers(Customer customers) {
		this.customers = customers;
	}public Customer getCustomers() {
		return customers;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	

	
}
