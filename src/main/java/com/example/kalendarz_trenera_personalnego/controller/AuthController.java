package com.example.kalendarz_trenera_personalnego.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String getLogin() {
        return "auth/login";
    }

    @GetMapping("/register")
    public String getRegister() {
        return "auth/register";
    }

    @GetMapping("/shop")
    public String getShop() {
        return "auth/shop";
    }

    @GetMapping("/contact")
    public String getContact() {
        return "auth/contact";
    }
}
