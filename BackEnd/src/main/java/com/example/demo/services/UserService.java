package com.example.demo.services;

import com.example.demo.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User u);
    User updateUser(Long id, User u);
    void deleteUserById(Long id);
    User getUser(Long id);
    List<User> getAllUsers();
}

