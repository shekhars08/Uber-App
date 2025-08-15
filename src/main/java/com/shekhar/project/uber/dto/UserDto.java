package com.shekhar.project.uber.dto;

import com.shekhar.project.uber.entities.enums.Role;
import java.util.Set;
public class UserDto {
    private String name;
    private String email;
    private Set<Role> roles;
}