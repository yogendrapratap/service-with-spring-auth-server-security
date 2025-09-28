package com.spring.servicewithspringauthserversecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("users")
    public String getUsers() {
        return "User details from user service";
    }

    @GetMapping("info")
    public String getInfo() {
        return "Info details from user service";
    }
}
