//package com.movieflix.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable() // Desativa proteção CSRF (evita erro 403 com POST pelo Insomnia)
//                .authorizeHttpRequests()
//                .anyRequest().permitAll(); // Libera acesso a todos os endpoints
//
//        return http.build();
//    }
//}
