package com.valtech.training.hibernate.emp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	@javax.persistence.Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private  String name;
	private int age;
	
	
	public Employee(int id, String name, int age) {
		Id = id;
		this.name = name;
		this.age = age;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Employee() {
	}
	
	
	

}
