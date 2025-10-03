package com.spring.servicewithspringauthserversecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity(jsr250Enabled = true, securedEnabled = true)
public class ServiceWithSpringAuthServerSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceWithSpringAuthServerSecurityApplication.class, args);
    }

}
