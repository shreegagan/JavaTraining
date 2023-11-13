package com.valtech.training.hibernate.emp;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Product {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int proId;
	private String proName;
	private double proAmount;

	@ManyToOne(targetEntity = Company.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, fetch = FetchType.EAGER)
	@JoinColumn(name = "compId", referencedColumnName = "compId")
	private Company company;
	
	@OneToMany(targetEntity = OrderItems.class,cascade= {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch=FetchType.LAZY,
			mappedBy="products")
	private Set<OrderItems> orderItems;
	
	public void setOrderItems(Set<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}public Set<OrderItems> getOrderItems() {
		return orderItems;
	}
	


	public Product() {
		// TODO Auto-generated constructor stub
	}
	


	
	public Product(String proName, double proAmount, Company company) {
		super();
		this.proName = proName;
		this.proAmount = proAmount;
		this.company = company;
	}




	public void setCompany(Company company) {
		this.company = company;
	}public Company getCompany() {
		return company;
	}



	public int getProId() {
		return proId;
	}


	public void setProId(int proId) {
		this.proId = proId;
	}


	public String getProName() {
		return proName;
	}


	public void setProName(String proName) {
		this.proName = proName;
	}


	public double getProAmount() {
		return proAmount;
	}


	public void setProAmount(double proAmount) {
		this.proAmount = proAmount;
	}



}
