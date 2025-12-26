package com.example.demo.repository;

import com.example.demo.model.User;
import java.util.*;

public interface UserRepository {
    User save(User user);
    Optional<User> findByEmail(String email);
    List<User> findAll();
}
