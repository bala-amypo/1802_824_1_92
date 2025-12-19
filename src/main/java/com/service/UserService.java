package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.model.User;
@Service
public interface UserService{

    public UserService User register(User user); 
    public UserService User findByEmail(String email);
    }