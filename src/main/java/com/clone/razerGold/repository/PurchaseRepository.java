package com.clone.razerGold.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clone.razerGold.entity.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long>{
    
}
