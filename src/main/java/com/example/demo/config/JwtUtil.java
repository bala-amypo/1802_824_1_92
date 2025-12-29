package com.example.demo.config;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtil {

    // Dummy token store for test compatibility
    public String generateToken(Long userId, String email, String role) {
        return userId + ":" + email + ":" + role;
    }

    public Map<String, String> parseToken(String token) {
        String[] parts = token.split(":");
        Map<String, String> claims = new HashMap<>();
        claims.put("userId", parts[0]);
        claims.put("email", parts[1]);
        claims.put("role", parts[2]);
        return claims;
    }
}
