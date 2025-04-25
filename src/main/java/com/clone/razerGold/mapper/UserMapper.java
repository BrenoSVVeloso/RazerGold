package com.clone.razerGold.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.clone.razerGold.entity.User;
import com.clone.razerGold.entity.dto.UserDTO;

public class UserMapper {
    
     public static User toEntity(UserDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        return user;
    }

    public static UserDTO toDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setPassword(user.getPassword());
        return dto;
    }

    public static List<UserDTO> toDTOList(List<User> user) {

        return user.stream().map(UserMapper::toDTO).collect(Collectors.toList());
   
    }

}
