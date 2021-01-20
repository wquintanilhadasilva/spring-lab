package com.lab.customer.repository;

import java.util.Optional;

import com.lab.customer.domain.Customer;

public interface CustomerRepository {
	
	public Optional<Customer> findById(Integer id);
	
}
