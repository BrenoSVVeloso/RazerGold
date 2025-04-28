package com.clone.razerGold.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clone.razerGold.entity.dto.UserDTO;
import com.clone.razerGold.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public UserDTO saveUser(@RequestBody UserDTO entity) {
        userService.saveUser(entity);
        return entity;
    }

    @GetMapping("")
    public UserDTO userById(@RequestParam long id) {
        
        return userService.getById(id);
    }

    @GetMapping("/all")
    public List<UserDTO> allUsers() {

        return userService.allUsers();
    }

    @PutMapping("/{id}")
    public UserDTO updateUser(@PathVariable long id, @RequestBody UserDTO entity) {
       
        return userService.updateUser(id, entity);
    }

    
    
    
    
}
