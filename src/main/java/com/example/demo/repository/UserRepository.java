package com.example.demo.repository;

import com.example.demo.model.User;
import java.util.Optional;

public interface UserRepository {

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);

    User save(User user);
}
