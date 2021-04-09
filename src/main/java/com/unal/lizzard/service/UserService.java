package com.unal.lizzard.service;

import  com.unal.lizzard.model.User;
import  com.unal.lizzard.dto.UserRegistationDto;


public interface UserService {
    User save (UserRegistationDto registationDto);
}
