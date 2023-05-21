package com.example.kalendarz_trenera_personalnego.controller;

import com.example.kalendarz_trenera_personalnego.model.UserModel;
import com.example.kalendarz_trenera_personalnego.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

public class RegistrationController {

    private UserService userService;

    @GetMapping("/register")
    public String getRegister() {
        return "auth/register";
    }

    @GetMapping("/re-register")
    public String getRegisterAgain() {
        return "auth/re-register";
    }

    @PostMapping("/register")
    public RedirectView postAddUser(UserModel userModel) {
        try {
            userService.addUser(userModel);
        } catch (Exception e) {
            return new RedirectView("/re-register");
        }
        return new RedirectView("/");
    }

    @PostMapping("/re-register")
    public RedirectView postAddUserAgain(UserModel userModel){
        try {
            userService.addUser(userModel);
        }catch(Exception e) {
            return new RedirectView("/re-register");
        }
        return new RedirectView("/");
    }
}
