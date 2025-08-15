package com.shekhar.project.uber.service;

import com.shekhar.project.uber.dto.DriverDto;
import com.shekhar.project.uber.dto.SignupDto;
import com.shekhar.project.uber.dto.UserDto;

public interface AuthService {

    String login(String email, String Password);
    UserDto signUp(SignupDto signupDto);
    DriverDto onboardDriver(Long userId);
}
