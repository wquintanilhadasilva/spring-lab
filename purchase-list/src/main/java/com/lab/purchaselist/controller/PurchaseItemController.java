package com.lab.purchaselist.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lab.purchaselist.domain.PurchaseItem;
import com.lab.purchaselist.repository.PurchaseItemRepository;

@RestController()
public class PurchaseItemController {
	
	@Autowired
	PurchaseItemRepository purchaseItemRepository;
	
	@GetMapping(value="/purchaseitem")
	public Iterable<PurchaseItem> all() {
		return purchaseItemRepository.findAll();
	}
	
	@RequestMapping(value="/purchaseitem/item/{name}", method=RequestMethod.GET)
	public PurchaseItem findByName(@PathVariable String name) {
		return purchaseItemRepository.findPurchaseItemByName(name);
	}
	
	@RequestMapping(value="/purchaseitem/{id}", method=RequestMethod.GET)
	public PurchaseItem findById(@PathVariable Integer id) {
		Optional<PurchaseItem> item = purchaseItemRepository.findById(id);
		if(item.isPresent()) {
			return item.get();
		}else {
			return null;
		}
	}

}
