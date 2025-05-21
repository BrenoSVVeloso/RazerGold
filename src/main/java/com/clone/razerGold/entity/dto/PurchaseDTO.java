package com.clone.razerGold.entity.dto;

import com.clone.razerGold.entity.Game;
import com.clone.razerGold.entity.enums.PayMethodEnum;
import com.clone.razerGold.entity.enums.PriceEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseDTO {
    
    private long id;

    private Game game;

    private PriceEnum price;

    private PayMethodEnum payMethod;

    private String email;

    private String promotionalCode;
}
