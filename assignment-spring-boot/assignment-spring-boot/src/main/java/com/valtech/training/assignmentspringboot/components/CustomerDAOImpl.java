package com.valtech.training.assignmentspringboot.components;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private DataSource dataSource;
	
	
	
	@Override
	public void createCustomer(Customer customer) {

		String createQry = "INSERT INTO Customer (CUSID,CUSNAME,PHONE,ADDRID) VALUES(?,?,?,?)";
		new JdbcTemplate(dataSource).update(createQry,customer.getCusId(),customer.getName(),customer.getPhone(),customer.getAddrId());
		
	}
	
	@Override
	public long count() {
		String countQry = "SELECT COUNT(CUSID) FROM CUSTOMER";
		return new JdbcTemplate(dataSource).queryForObject(countQry, Long.class);

	}
	
}
