package com.example.demo.service;

import com.example.demo.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {

    User saveUser(User user);

    User register(User user);

    Optional<User> findByEmail(String email);

    User getUserById(Long id);

    List<User> getAllUsers();
}
