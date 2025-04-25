package com.clone.razerGold.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clone.razerGold.entity.User;
import com.clone.razerGold.entity.dto.UserDTO;
import com.clone.razerGold.repository.PurchaseRepository;

@Service
public class PurchaseService {


    @Autowired
    private PurchaseRepository purchaseRepository;
    
    
}
