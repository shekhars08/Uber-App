package com.shekhar.project.uber.service.impl;

import com.shekhar.project.uber.dto.DriverDto;
import com.shekhar.project.uber.dto.SignupDto;
import com.shekhar.project.uber.dto.UserDto;
import com.shekhar.project.uber.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public  class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String Password) {
        return "";
    }

    @Override
    public UserDto signUp(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardDriver(Long userId) {
        return null;
    }
}