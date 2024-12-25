package com.example.user_registration.Service;

import com.example.user_registration.dto.UserDto;
import com.example.user_registration.model.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}