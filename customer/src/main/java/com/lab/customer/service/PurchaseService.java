package com.lab.customer.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lab.customer.domain.PurchaseItem;

//@FeignClient(name="purchase-list")
public interface PurchaseService {
	
	@GetMapping(value="/purchaseitem/{id}")
	public PurchaseItem findById(@PathVariable ("id") Integer id);

}
