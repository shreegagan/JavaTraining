package com.valtech.training.assignmentspringboot.components;

public interface CustomerDAO {

	void createCustomer(Customer customer);

	long count();

}