package com.valtech.training.hibernate.emp;

import java.util.Date;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name="orders")
public class Order {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;

	@Basic() @Temporal(TemporalType.DATE)
	private Date orderDate;
	@ManyToOne(targetEntity = Customer.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST,CascadeType.REFRESH }, fetch = FetchType.LAZY)
	@JoinColumn(name = "cusId", referencedColumnName = "cusId")
	private Customer customer;
	
	@OneToMany(targetEntity = OrderItems.class,cascade= {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch=FetchType.LAZY,
			mappedBy="orders")
	private Set<OrderItems> orderItems;
	
	
	public Order() {
	}
	
	
	public Order(Date orderDate, Customer customer) {
		this.orderDate = orderDate;
		this.customer = customer;
	}
	public void setOrderItems(Set<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}public Set<OrderItems> getOrderItems() {
		return orderItems;
	}

	

	public Order(  Date orderDate) {
		this.orderDate = orderDate;
	}
	
	
	public void setCustomers(Customer customer) {
		this.customer = customer;
	}
	public Customer getCustomer() {
		return customer;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
}
