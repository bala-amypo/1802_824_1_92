package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo){ this.repo=repo; }

    public User register(User u) {
        if(repo.existsByEmail(u.getEmail()))
            throw new RuntimeException("exists");
        u.setPassword("HASHED_"+u.getPassword());
        return repo.save(u);
    }

    public User findByEmail(String email){
        return repo.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("not"));
    }
}
