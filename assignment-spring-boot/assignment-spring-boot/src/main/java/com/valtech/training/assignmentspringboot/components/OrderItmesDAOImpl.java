package com.valtech.training.assignmentspringboot.components;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class OrderItmesDAOImpl implements OrderItemsDAO {
	@Autowired
	private DataSource dataSource;
	
	
	
	@Override
	public void createOrderItems(OrderItems orderItems) {

		String createQry = "INSERT INTO ORDERITEMS (PROQUANTITY,ORDERID,PROID) VALUES(?,?,?)";
		new JdbcTemplate(dataSource).update(createQry,orderItems.getProQuantity(),orderItems.getOrderId(),orderItems.getProId());
		
	}
	
	
	@Override
	public long count() {
		String countQry = "SELECT COUNT(PROID) FROM ORDERITEMS";
		return new JdbcTemplate(dataSource).queryForObject(countQry, Long.class);

	}

}
