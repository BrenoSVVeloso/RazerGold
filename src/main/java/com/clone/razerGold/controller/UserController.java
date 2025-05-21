package com.clone.razerGold.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clone.razerGold.entity.dto.UserDTO;
import com.clone.razerGold.service.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("br/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public UserDTO saveUser(@RequestBody UserDTO entity) {
        userService.saveUser(entity);
        return entity;
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@RequestParam long id) {
        
        return userService.getById(id);
    }

    @GetMapping("/all")
    public List<UserDTO> getAllUsers() {

        return userService.getAllUsers();
    }

    @PutMapping("/{id}")
    public UserDTO updateUser(@PathVariable long id, @RequestBody UserDTO entity) {
       
        return userService.updateUser(id, entity);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable long id){
        
        return userService.deleteUser(id);
    }
    
    
    
    
}
