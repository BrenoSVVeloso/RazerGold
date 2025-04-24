package com.clone.razerGold.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/br/pt-br")
public class RazerGoldController {
    
    @GetMapping("")
    public String menu(){
        return "VOCE ESTÁ NO MENU";
    }

    @GetMapping("/catalog/{gameName}")
    public String menuValorant(@PathVariable String gameName) {
        return "VOCE ESTÁ NO MENU DO " + gameName;
    }
    

    @PostMapping("/catalog/{gameName}")
    public String postMethodName(@RequestBody String entity, @PathVariable String gameName) {
        
        return entity;
    }
    

}
