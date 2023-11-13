package com.valtech.training.hibernate.emp;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="orderItem")
public class OrderItems {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	
	@ManyToOne(targetEntity = Product.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, fetch = FetchType.EAGER)
	@JoinColumn(name = "proId", referencedColumnName = "proId")
	private Product products;
	@ManyToOne(targetEntity = Order.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, fetch = FetchType.EAGER)
	@JoinColumn(name = "orderId", referencedColumnName = "orderId")
	private Order orders;
	private int proQuantity;
	

	public OrderItems() {
	}

	public OrderItems(Product products, Order orders, int proQuantity) {
		this.products = products;
		this.orders = orders;
		this.proQuantity = proQuantity;
	}



	public Product getProducts() {
		return products;
	}

	public void setProducts(Product products) {
		this.products = products;
	}

	public Order getOrders() {
		return orders;
	}

	public void setOrders(Order orders) {
		this.orders = orders;
	}

	public int getProQuantity() {
		return proQuantity;
	}


	public void setProQuantity(int proQuantity) {
		this.proQuantity = proQuantity;
	}
}	
