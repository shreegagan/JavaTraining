package com.valtech.training.hibernate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String pasword;
	private int mobile;
	@Embedded
	private RegAddress regAddress;
	
	
	
	public Registration() {
	}

	public Registration(String username, String pasword, int mobile, RegAddress regAddress) {
		super();
		this.username = username;
		this.pasword = pasword;
		this.mobile = mobile;
		this.regAddress = regAddress;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPasword() {
		return pasword;
	}



	public void setPasword(String pasword) {
		this.pasword = pasword;
	}



	public int getMobile() {
		return mobile;
	}



	public void setMobile(int mobile) {
		this.mobile = mobile;
	}



	public RegAddress getRegAddress() {
		return regAddress;
	}



	public void setRegAddress(RegAddress regAddress) {
		this.regAddress = regAddress;
	}
	
	
}
