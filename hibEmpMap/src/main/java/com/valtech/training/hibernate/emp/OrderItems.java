package com.valtech.training.hibernate.emp;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderItems {
	@EmbeddedId
	private int orderId;
	@EmbeddedId
	private int proId;
	private int proQuantity;
	

	public OrderItems() {
	}


	public OrderItems( int proId, int proQuantity) {
		this.proId = proId;
		this.proQuantity = proQuantity;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getProId() {
		return proId;
	}


	public void setProId(int proId) {
		this.proId = proId;
	}


	public int getProQuantity() {
		return proQuantity;
	}


	public void setProQuantity(int proQuantity) {
		this.proQuantity = proQuantity;
	}

	
}
