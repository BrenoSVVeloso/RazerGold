package com.clone.razerGold.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clone.razerGold.entity.User;
import com.clone.razerGold.entity.dto.UserDTO;
import com.clone.razerGold.repository.PurchaseRepository;
import com.clone.razerGold.service.PurchaseService;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/br/pt-br")
public class RazerGoldController {


    private PurchaseService purchaseService;


    @PostMapping("/login")
    public UserDTO saveUser(@RequestBody UserDTO entity) {
        
        purchaseService.saveUser(entity);
        
        return entity;
    }
    
    
    @GetMapping("")
    public String menu(){
        return "VOCE ESTÁ NO MENU";
    }

    @GetMapping("/catalog/{gameName}")
    public String menuValorant(@PathVariable String gameName) {
        return "BIANCA EU TE AMO";
    }
    

    @PostMapping("/catalog/{gameName}")
    public String postMethodName(@RequestBody String entity, @PathVariable String gameName) {
        
        return entity;
    }
    

}
