package com.lab.purchaselist.domain;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="purchase_item")
@Entity
public class PurchaseItem implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	Integer purchaseId;
	
	@Column(name="create_at")
	Instant createAt;
	
	@Column(name="name")
	String name;
	
	@Column(name="customer_id")
	String customerid;
	
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

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	@Override
	public String toString() {
		return "PurchaseItem [purchaseId=" + purchaseId + ", createAt=" + createAt + ", name=" + name + ", customerid=" + customerid + "]";
	}
	
}
