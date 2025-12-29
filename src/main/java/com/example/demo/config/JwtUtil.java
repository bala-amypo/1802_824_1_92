package com.example.demo.config;

public class JwtUtil {

    public String generateToken(Long userId, String email, String role) {
        return "token-" + userId;
    }

    public String parseToken(String token) {
        return token;
    }
}
