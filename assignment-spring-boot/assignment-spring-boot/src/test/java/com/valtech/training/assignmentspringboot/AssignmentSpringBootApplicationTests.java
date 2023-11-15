package com.valtech.training.assignmentspringboot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.training.assignmentspringboot.components.Address;
import com.valtech.training.assignmentspringboot.components.AddressDAO;
import com.valtech.training.assignmentspringboot.components.AddressDAOImpl;
import com.valtech.training.assignmentspringboot.components.Company;
import com.valtech.training.assignmentspringboot.components.CompanyDAO;
import com.valtech.training.assignmentspringboot.components.Customer;
import com.valtech.training.assignmentspringboot.components.CustomerDAO;
import com.valtech.training.assignmentspringboot.components.HelloWorld;
import com.valtech.training.assignmentspringboot.components.Order;
import com.valtech.training.assignmentspringboot.components.OrderDAO;
import com.valtech.training.assignmentspringboot.components.OrderItems;
import com.valtech.training.assignmentspringboot.components.OrderItemsDAO;
import com.valtech.training.assignmentspringboot.components.Product;
import com.valtech.training.assignmentspringboot.components.ProductDAO;


@SpringBootTest
class AssignmentSpringBootApplicationTests {
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

	@Autowired
	private HelloWorld helloWorld;
	
	@Autowired
	private AddressDAO addressDAO;
	
	@Autowired
	private CompanyDAO companyDAO;
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private OrderDAO orderDAO;
	
	@Autowired
	private OrderItemsDAO orderItemsDAO;
	
//	@Test
//	public void testOrderItems() {
//		OrderItems orderItmes =new OrderItems(1,1,1);
//		orderItemsDAO.createOrderItems(orderItmes);
//		assertEquals(1, orderItemsDAO.count());
//	}
//	
	
//	@Test
//	public void testOrders() throws ParseException {
//		Order orders= new Order(1,1,df.parse("19-11-2023"));
//		orderDAO.createOrder(orders);
//		assertEquals(1, orderDAO.count());
//	}
	
//	@Test
//	public void testProduct() {
//		Product product = new Product(2,"PHONE",1200.00,1);
//		productDAO.createProduct(product);
//		assertEquals(2, productDAO.count());
//	}
	
	
	
//	@Test
//	public void testCustomer() {
//		Customer customer= new Customer(3,"Gagan",1234123412,3);
//		customerDAO.createCustomer(customer);
//		assertEquals(3, customerDAO.count());
//		
//	}
	
//	
//	@Test
//	void testCompany() {
//		Company  comp= new Company(2,"valtech",3);
//		companyDAO.createCompany(comp);
//		assertEquals(2, companyDAO.count());
//	}
//	
	
//	@Test
//	void testAddress(){
//		assertEquals(0, addressDAO.count());
//	}
	@Test
	void testAddr() {
//		Address address =new Address(3,"Mattikere","Bengaluru",123431);
//		addressDAO.createAddress(address);
//		assertEquals(1, addressDAO.count());
//		assertTrue(addressDAO.getAllAddress().size() > 0);
		
//		addressDAO.deleteAddress(3);
//		assertEquals(0, addressDAO.count());
		Address address =new Address("BEL","BLR",991188);
		addressDAO.updateAddress(address,3);
		assertEquals(1, addressDAO.count());
		
//	System.out.println(addressDAO.getAddress(3));	

		
		
		
		
		
	}
//	
//	@Test
//	void contextLoads() {
//		assertNotNull(helloWorld);
//		
//		assertEquals("Hello Spring Boot", helloWorld.hello());
//	}
//	
}
