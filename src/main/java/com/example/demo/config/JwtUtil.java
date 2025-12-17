package com.example.demo.config;

private static final String SECRET_KEY = "mySecretKey";
private stati final long EXPIRATION_TIME = 1000 * 60 * 60; // 1 hour

// Generate JWT
public static String generateToken(String username) {
    return Jwts.builder()
    .setSubject(username)
    .setIssuedAt(new Data())
    .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
    .signWith(SignatureAlgorithm.HS256,SECRET_KEY)
    .compact();
}

// Validate token
public static boolean 
ValidateToken