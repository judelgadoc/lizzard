package com.unal.lizzard.service;

import com.unal.lizzard.repository.UserRepository;
import com.unal.lizzard.dto.UserRegistationDto;
import org.springframework.stereotype.Service;
import com.unal.lizzard.model.*;
import java.util.Arrays;

@Service
public class UserServiceImpl  implements  UserService{
    private UserRepository  userRepository;

    public UserServiceImpl(UserRepository userRepository){
        super();
        this.userRepository= userRepository;
    }
    @Override
    public User save(UserRegistationDto registationDto ){
        User user = new User( registationDto.getFristName(),registationDto.getLastName(),registationDto.getEmail()
        ,registationDto.getPassword(), Arrays.asList(new Role(name = "ROLE_USER")));

        return userRepository.save(user);
    }






















}
