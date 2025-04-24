package com.clone.razerGold.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "games")
@Getter
@Setter
@AllArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;

    @Column(nullable = false)
    private String developer;

    @Column(nullable = false)
    private String gameStyle;

    @Column(nullable = false)
    private String coinName;
}
