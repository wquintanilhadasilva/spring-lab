package com.lab.customer.domain;

import java.io.Serializable;
import java.time.Instant;

public class PurchaseItem implements Serializable{
	
	private static final long serialVersionUID = 1L;

	Integer purchaseId;
	
	Instant createAt;
	
	String name;
	
	public Integer getPurchaseId() {
		return purchaseId;
	}


	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}


	public Instant getCreateAt() {
		return createAt;
	}


	public void setCreateAt(Instant createAt) {
		this.createAt = createAt;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "PurchaseItem [purchaseId=" + purchaseId + ", createAt=" + createAt + ", name=" + name +  "]";
	}
	
}
