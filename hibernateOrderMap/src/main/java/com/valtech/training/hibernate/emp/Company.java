package com.valtech.training.hibernate.emp;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Company {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int compId;
	private String compName;
	@OneToOne(targetEntity = Address.class, cascade = { CascadeType.MERGE, CascadeType.REMOVE }, fetch = FetchType.EAGER)
	@JoinColumn(name = "addrId", referencedColumnName = "Id")
	private Address address;
	
	
	@OneToMany(targetEntity = Product.class,cascade= {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch=FetchType.LAZY,
			mappedBy="company")
//	@JoinColumn(name = "compId", referencedColumnName = "compId")
	private Set<Product> products;
	
//	public Company( String compName) {
//		this.compName = compName;
//		
//	}


	public Company(String compName, Address address) {
		this.compName = compName;
		this.address = address;
	}


	public Company() {
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}public Set<Product> getProducts() {
		return products;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
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


	
	

}
