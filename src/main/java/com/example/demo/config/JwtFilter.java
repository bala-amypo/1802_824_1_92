package com.example.demo.config;

import io.jsonwebtoken.*;
import java.util.Date;

public class JwtUtil {

    private static final String SECRET_KEY =  "mySecretKey";
    private static final long EXPIRATION_TIME = 1000 * 60 * 60; // 1 hour;

    // Generate JWT
    public static String generateToken(String username){
        return Jwts.builder()
        .setSubject(username)
    }
}