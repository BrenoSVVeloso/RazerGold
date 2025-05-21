package com.clone.razerGold.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clone.razerGold.entity.User;
import com.clone.razerGold.entity.dto.UserDTO;
import com.clone.razerGold.mapper.UserMapper;
import com.clone.razerGold.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO saveUser(UserDTO userDTO){
        
        User user = UserMapper.toEntity(userDTO);

        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());

        user.setId(userRepository.save(user).getId());
        
        return UserMapper.toDTO(user);
    }


    public UserDTO getById(long id){

        Optional<User> user = userRepository.findById(id);

        if(user.isPresent()){

            return UserMapper.toDTO(user.get());

        }else{            

            throw new RuntimeException("User not found");
        }
        
    }

    public List<UserDTO> getAllUsers(){
        
        return UserMapper.toDTOList(userRepository.findAll());
    }


    public UserDTO updateUser(long id, UserDTO userDTO) {
        
        Optional<User> user = userRepository.findById(id);
        
        if(user.isPresent()){
            user.get().setId(userDTO.getId());
            user.get().setName(userDTO.getName());
            user.get().setEmail(userDTO.getEmail());
            user.get().setPassword(userDTO.getPassword());

            return UserMapper.toDTO(userRepository.save(user.get()));

        }else {

            throw new RuntimeException("User not found");
        }
    }


    public String deleteUser(long id) {
        
        Optional<User> user = userRepository.findById(id);

        if(user.isPresent()){
            
            userRepository.delete(user.get());

            return "User successfully deteled";
        
        }else{

            throw new RuntimeException("User not found");
        }
        
    }
}
