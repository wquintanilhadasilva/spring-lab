package com.lab.purchaselist.repository;

import org.springframework.data.repository.CrudRepository;

import com.lab.purchaselist.domain.PurchaseItem;

public interface PurchaseItemRepository extends CrudRepository<PurchaseItem, Integer>{
	
	PurchaseItem findPurchaseItemByName(String name);

}
