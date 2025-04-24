package com.clone.razerGold.entity.enums;

public enum PriceEnum {
    
    CASH16(16),

    CASH32(32),

    CASH64(64),

    CASH113(113),

    CASH160(160),

    CASH320(320);

    private final double valor;

    PriceEnum(double valor){
        this.valor = valor;
    }

    public Double getValor(){
        return valor;
    }
}
