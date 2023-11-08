package com.valtech.training.hibernate.emp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int proId;
	private String proName;
	private double proAmount;
	private int compId;
	@ManyToOne(targetEntity = Company.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, fetch = FetchType.EAGER)
	@JoinColumn(name = "compId", referencedColumnName = "compid")
	private Company company;


	public Product() {
		// TODO Auto-generated constructor stub
	}
	


	public Product( String proName, double proAmount, int compId) {
		this.proName = proName;
		this.proAmount = proAmount;
		this.compId = compId;
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


	public int getCompId() {
		return compId;
	}


	public void setCompId(int compId) {
		this.compId = compId;
	}
	
	

}
