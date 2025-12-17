package com.example.demo.config;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.io.IOException;

import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;

public class JwtFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(
        HttpServletRequest request,
        HttpServletResponse response,
        FilterChain filterChain)
        throws ServletException,
        IOException {

            String header = request.getHeader("Authorization");

            if (header != null && header.startsWith("Bearer")) {
                String token = header.substring(7);

                if (JwtUtil.validateToken(token)) {
                    String username = JwtUtil.extractUsername
                }
            }
        }
}