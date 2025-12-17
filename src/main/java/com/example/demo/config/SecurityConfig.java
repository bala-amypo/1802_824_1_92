package com.example.demo.config;

import org.springframework.context.annotation.*;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class Securityconfig {

    @Bean
    public JwtFilter jwtFilter() {
        return new jwtFilter();
    }

    @Bean
    public SecurityFilterChain
    filterChain(HttpSecurity http) throws Exception {

        http
        .csrf(csrf -> csrf.disable())
        .authorizeHttpRequests(auth -> auth
        .requestMatchers("/auth/**").permitAll()
        .anyRequest().authenticated(
    )
        )
        .addFilterBefore(jwtFilter(),UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}