package com.valtech.training.assignmentspringboot.components;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class CompanyDAOImpl implements CompanyDAO {

	@Autowired
	private DataSource dataSource;
	
	
	@Override
	public void createCompany(Company company) {

		String createQry = "INSERT INTO COMPANY (COMPANYID,COMPANYNAME,ADDRID) VALUES(?,?,?)";
		new JdbcTemplate(dataSource).update(createQry,company.getCompId(),company.getCompName(),company.getAddrId() );
		
	}
	@Override
	public long count() {
		String countQry = "SELECT COUNT(COMPANYID) FROM COMPANY";
		return new JdbcTemplate(dataSource).queryForObject(countQry, Long.class);

	}
	
}
