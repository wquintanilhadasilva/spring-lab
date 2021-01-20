package com.lab.customer.repository;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lab.customer.domain.Customer;

@Service
public class CustomerRepositoryImpl implements CustomerRepository{

	@Override
	public Optional<Customer> findById(Integer id) {
		var customer = new Customer();
		customer.setId(1);
		customer.setName("Customer 1");
		return Optional.of(customer);
	}

}
