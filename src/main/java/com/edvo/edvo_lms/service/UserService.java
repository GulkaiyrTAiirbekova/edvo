package com.edvo.edvo_lms.service;

import com.edvo.edvo_lms.model.User;
import com.edvo.edvo_lms.dto.UserRegistrationDto;


public interface UserService {
    void registerUser(UserRegistrationDto dto);
    User findByUsername(String username);
}