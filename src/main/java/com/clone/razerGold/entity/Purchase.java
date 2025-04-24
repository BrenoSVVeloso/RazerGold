package com.clone.razerGold.entity;

import com.clone.razerGold.entity.enums.PayMethodEnum;
import com.clone.razerGold.entity.enums.PriceEnum;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "purchases")
@Setter
@Getter
@AllArgsConstructor
public class Purchase {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "game_name")
    private Game game;

    @Enumerated(EnumType.STRING)
    private PriceEnum price;

    @Enumerated(EnumType.STRING)
    private PayMethodEnum payMethod;

    @Column(nullable = false)
    private String email;

    @Column(nullable = true)
    @Nullable
    private String promotionalCode;

}
