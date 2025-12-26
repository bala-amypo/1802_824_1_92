package com.example.demo.security;

import org.springframework.stereotype.Component;

import java.util.Base64;
import java.util.Date;

@Component
public class JwtUtil {

    private static final long EXPIRATION_TIME = 1000 * 60 * 60; // 1 hour

    // Generate a simple encoded token
    public String generateToken(String username) {
        long expiry = System.currentTimeMillis() + EXPIRATION_TIME;
        String tokenData = username + ":" + expiry;
        return Base64.getEncoder().encodeToString(tokenData.getBytes());
    }

    // Extract username from token
    public String extractUsername(String token) {
        try {
            String decoded = new String(Base64.getDecoder().decode(token));
            return decoded.split(":")[0];
        } catch (Exception e) {
            return null;
        }
    }

    // Check token expiration
    public boolean isTokenExpired(String token) {
        try {
            String decoded = new String(Base64.getDecoder().decode(token));
            long expiry = Long.parseLong(decoded.split(":")[1]);
            return expiry < System.currentTimeMillis();
        } catch (Exception e) {
            return true;
        }
    }
}
