package com.valtech.training.hibernate.emp;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Company {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int compId;
	private String compName;
	private String compAddress;
	@OneToMany(targetEntity = Product.class,cascade= {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch=FetchType.LAZY,
			mappedBy="company")
	private Set<Product> products;
	
	public Company( String compName, String compAddress) {
		this.compName = compName;
		this.compAddress = compAddress;
	}


	public Company() {
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}public Set<Product> getProducts() {
		return products;
	}
	
	
	public int getCompId() {
		return compId;
	}


	public void setCompId(int compId) {
		this.compId = compId;
	}


	public String getCompName() {
		return compName;
	}


	public void setCompName(String compName) {
		this.compName = compName;
	}


	public String getCompAddress() {
		return compAddress;
	}


	public void setCompAddress(String compAddress) {
		this.compAddress = compAddress;
	}

	

}
