package com.valtech.training.assignmentspringboot.components;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductADOImpl implements ProductDAO {
	
	@Autowired
	private DataSource dataSource;
 
	@Override
	public void createProduct(Product product) {
		String createQry= "INSERT INTO PRODUCTS(PROID,PRONAME,PROAMOUNT,COMPANYID) values(?,?,?,?)";
		new JdbcTemplate(dataSource).update(createQry,product.getProId(),product.getProName(),product.getProAmount(),product.getCompId());
		
	}
	
	@Override
	public long count() {
		String countQry = "SELECT COUNT(PROID) FROM PRODUCTS";
		return new JdbcTemplate(dataSource).queryForObject(countQry, Long.class);

	}
	

}
