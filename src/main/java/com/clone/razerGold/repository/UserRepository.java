package com.clone.razerGold.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clone.razerGold.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
