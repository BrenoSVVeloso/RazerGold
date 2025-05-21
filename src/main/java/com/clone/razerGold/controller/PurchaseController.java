package com.clone.razerGold.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clone.razerGold.entity.dto.PurchaseDTO;
import com.clone.razerGold.service.PurchaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("br/purchase")
public class PurchaseController {
    

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping("")
    public PurchaseDTO savePurchase(@RequestBody PurchaseDTO purchaseDTO) {
        
        return purchaseService.savePurchase(purchaseDTO);
    }
    
    @GetMapping("/{id}")
    public PurchaseDTO getPurchaseById(@PathVariable long id) {
        return purchaseService.getById(id);
    }
    

}
