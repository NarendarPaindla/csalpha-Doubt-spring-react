package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.repository.UserRepository;

public class UserService {
    @Autowired
    private UserRepository userRepository;
}
