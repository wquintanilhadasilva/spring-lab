package com.lab.customer.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lab.customer.domain.Customer;
import com.lab.customer.repository.CustomerRepository;
import com.lab.customer.service.PurchaseService;

@RestController()
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	PurchaseService purchaseService;
	
	@GetMapping(value="/customer/{id}")
	public Customer getById(@PathVariable("id") Integer id) {
		Optional<Customer> opt = this.customerRepository.findById(id);
		if(opt.isPresent()) {
			Customer cust = opt.get();
			var item = this.purchaseService.findById(cust.getId());
			cust.setPurchaseItem(item);
			return cust;
		}else {
			return null;
		}
	}

}
