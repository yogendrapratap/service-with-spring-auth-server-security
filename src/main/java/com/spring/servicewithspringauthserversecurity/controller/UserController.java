package com.spring.servicewithspringauthserversecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("users")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String getUsers() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "User details from user service :" + authentication.getName();
    }

    @GetMapping("info")
    public String getInfo() {
        return "Info details from user service";
    }
}
