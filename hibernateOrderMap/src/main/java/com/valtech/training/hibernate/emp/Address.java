package com.valtech.training.hibernate.emp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String street;
	private String city;
	private int zipCode;

	@OneToOne(targetEntity = Customer.class, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER,mappedBy ="address")
//	@JoinColumn(name = "cusId", referencedColumnName = "cusId") // Creating a column cust_id in address (Slave)
	private Customer customer;
	@OneToOne(targetEntity = Company.class, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER,mappedBy ="address" )
//	@JoinColumn(name = "compid", referencedColumnName = "compId")
	private Company company;

	public Address() {
	}

	public Address(String street, String city, int zipCode) {
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}

	public void setCompany(Company company) {
		this.company = company;
	}public Company getCompany() {
		return company;
	}
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

	

	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

}



