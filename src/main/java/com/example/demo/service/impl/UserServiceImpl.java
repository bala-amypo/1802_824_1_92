package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Existing method
    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    // Existing method
    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // ✅ REQUIRED BY CONTROLLER
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // ✅ REQUIRED BY CONTROLLER
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // ✅ REQUIRED BY CONTROLLER
    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
