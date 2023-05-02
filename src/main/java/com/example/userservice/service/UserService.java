package com.example.userservice.service;

import com.example.userservice.dto.UserDto;

/**
 * UserService.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.05.02
 */
public interface UserService {

    UserDto createUser(UserDto userDto);
}
