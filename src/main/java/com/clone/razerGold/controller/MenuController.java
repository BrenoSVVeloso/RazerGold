package com.clone.razerGold.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clone.razerGold.entity.User;
import com.clone.razerGold.entity.dto.UserDTO;
import com.clone.razerGold.repository.PurchaseRepository;
import com.clone.razerGold.service.PurchaseService;
import com.clone.razerGold.service.UserService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/br/menu")
public class MenuController {
    
    @GetMapping("")
    public String menu(){
        return "VOCE ESTÁ NO MENU";
    }

    @GetMapping("/catalog/{gameName}")
    public String menuGames(@PathVariable String gameName) {
        return "BIANCA EU TE AMO";
    }

    @GetMapping("/catalog/valorant")
    public String menuGames() {
        return "BIANCA EU TE AMO";
    }

}
