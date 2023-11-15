package com.valtech.training.assignmentspringboot.components;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class OrderDAOImpl implements OrderDAO {
	
	

	@Autowired
	private DataSource dataSource;
	
	
	
	
	@Override
	public void createOrder(Order order) {

		String createQry = "INSERT INTO ORDERS (ORDERID,ORDERDATE,CUSID) VALUES(?,?,?)";
		new JdbcTemplate(dataSource).update(createQry,order.getOrderId(),order.getOrderDate(),order.getCusId());
		
	}
	
	
	@Override
	public long count() {
		String countQry = "SELECT COUNT(ORDERID) FROM ORDERS";
		return new JdbcTemplate(dataSource).queryForObject(countQry, Long.class);

	}
}
