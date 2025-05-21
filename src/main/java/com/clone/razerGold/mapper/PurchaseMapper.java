package com.clone.razerGold.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.clone.razerGold.entity.Purchase;
import com.clone.razerGold.entity.dto.PurchaseDTO;
public class PurchaseMapper {
    
    public static Purchase toEntity(PurchaseDTO dto) {
        Purchase purchase = new Purchase();
        purchase.setGame(dto.getGame());
        purchase.setEmail(dto.getEmail());
        purchase.setPayMethod(dto.getPayMethod());
        purchase.setPrice(dto.getPrice());
        purchase.setPromotionalCode(dto.getPromotionalCode());
        return purchase;
    }

    public static PurchaseDTO toDTO(Purchase purchase) {
        PurchaseDTO dto = new PurchaseDTO();
        dto.setGame(purchase.getGame());
        dto.setEmail(purchase.getEmail());
        dto.setPayMethod(purchase.getPayMethod());
        dto.setPrice(purchase.getPrice());
        dto.setPromotionalCode(purchase.getPromotionalCode());
        return dto;
    }

    public static List<PurchaseDTO> toDTOList(List<Purchase> purchases) {

        return purchases.stream().map(PurchaseMapper::toDTO).collect(Collectors.toList());
   
    }

}
