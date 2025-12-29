package com.example.demo.service;

import com.example.demo.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {

    // Existing
    User register(User user);

    Optional<User> findByEmail(String email);

    // ✅ Required by UserController
    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);
}
