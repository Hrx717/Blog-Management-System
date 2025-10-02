package com.example.blog_management.services;

import com.example.blog_management.payloads.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO user);
    UserDTO updateUser(UserDTO user, Long id);
    UserDTO deleteUser(Long id);
    UserDTO getUserById(Long id);
    List<UserDTO> getUsers();
}
