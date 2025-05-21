package com.clone.razerGold.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clone.razerGold.entity.Purchase;
import com.clone.razerGold.entity.User;
import com.clone.razerGold.entity.dto.PurchaseDTO;
import com.clone.razerGold.entity.dto.UserDTO;
import com.clone.razerGold.mapper.PurchaseMapper;
import com.clone.razerGold.repository.PurchaseRepository;

@Service
public class PurchaseService {


    @Autowired
    private PurchaseRepository purchaseRepository;

    public PurchaseDTO savePurchase(PurchaseDTO purchaseDTO) {
        
        Purchase purchase = PurchaseMapper.toEntity(purchaseDTO);


        purchase.setId(purchaseRepository.save(purchase).getId());

        return PurchaseMapper.toDTO(purchase);

    }

    public PurchaseDTO getById(long id) {
        
        Optional<Purchase> purchase = purchaseRepository.findById(id);

        if(purchase.isPresent()){
            
            return PurchaseMapper.toDTO(purchase.get());
        
        }else{

            throw new RuntimeException("User not found");

        }
    }
    
    
}
