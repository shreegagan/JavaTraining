package com.valtech.training.assignmentspringboot.components;

public interface OrderDAO {

	void createOrder(Order order);

	long count();

}