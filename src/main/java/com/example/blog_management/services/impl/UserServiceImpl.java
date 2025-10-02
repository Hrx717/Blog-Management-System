package com.example.blog_management.services.impl;

import com.example.blog_management.payloads.UserDTO;
import com.example.blog_management.repositories.UserRepo;
import com.example.blog_management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDTO createUser(UserDTO user) {
        return null;
    }

    @Override
    public UserDTO updateUser(UserDTO user, Long id) {
        return null;
    }

    @Override
    public UserDTO deleteUser(Long id) {
        return null;
    }

    @Override
    public UserDTO getUserById(Long id) {
        return null;
    }

    @Override
    public List<UserDTO> getUsers() {
        return List.of();
    }
}
