package com.example.demo.util;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    public String generateToken(String id, String email, String role) {
        return "dummy-jwt-token";
    }
}
