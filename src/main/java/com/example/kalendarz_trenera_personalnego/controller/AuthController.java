package com.example.kalendarz_trenera_personalnego.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String getLogin() {
        return "auth/login";
    }

//    @PostMapping("/login")
//    public String login() {
//        return "events/eventsList";
//    }

    @GetMapping("/register")
    public String getRegister() {
        return "auth/register";
    }

    @GetMapping("/re-register")
    public String getRegisterAgain() {
        return "auth/re-register";
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
