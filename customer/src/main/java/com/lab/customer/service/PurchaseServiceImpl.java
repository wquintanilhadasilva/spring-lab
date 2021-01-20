package com.lab.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lab.customer.domain.PurchaseItem;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class PurchaseServiceImpl implements PurchaseService{
	
	@Autowired
	@LoadBalanced
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "defaultPurchase")
	@Override
	public PurchaseItem findById(Integer id) {
		return restTemplate.getForObject("http://PURCHASE-LIST/purchaseitem/{id}", PurchaseItem.class, id);
	}
	
	@SuppressWarnings("unused")
	private PurchaseItem defaultPurchase(Integer id) {
		return null;
	}

}
