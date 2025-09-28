package com.spring.servicewithspringauthserversecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        /*http.authorizeHttpRequests((requests) -> requests.anyRequest().denyAll())
        http.authorizeHttpRequests((requests) -> requests.anyRequest().permitAll())*/

        http
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/users").authenticated()
                        .requestMatchers("/info").permitAll())
                .formLogin(withDefaults())
                .httpBasic(withDefaults());
                return http.build();
    }
}
