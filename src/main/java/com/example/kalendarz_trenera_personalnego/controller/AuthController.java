package com.example.kalendarz_trenera_personalnego.controller;

import com.example.kalendarz_trenera_personalnego.ApplicationContext;
import com.example.kalendarz_trenera_personalnego.model.UserModel;
import com.example.kalendarz_trenera_personalnego.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequiredArgsConstructor
public class AuthController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    private final UserService userService;

    @GetMapping("/login")
    public String getLogin(HttpServletRequest request, HttpSession session) {
        session.setAttribute("error", getErrorMessage(request, "SPRING_SECURITY_LAST_EXCEPTION"));
        return "auth/login";
    }

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

    @PostMapping("/register")
    public RedirectView postAddUser(UserModel userModel) {
        try {
            userModel.setAccountNonLocked(true);
            userModel.setPassword(passwordEncoder.encode(userModel.getPassword()));
            userService.addUser(userModel);
        } catch (Exception e) {
            return new RedirectView("/re-register");
        }
        return new RedirectView("/");
    }

    @PostMapping("/re-register")
    public RedirectView postAddUserAgain(UserModel userModel) {
        try {
            userModel.setAccountNonLocked(true);
            userModel.setPassword(passwordEncoder.encode(userModel.getPassword()));
            userService.addUser(userModel);
        } catch (Exception e) {
            return new RedirectView("/re-register");
        }
        return new RedirectView("/");
    }

    private String getErrorMessage(HttpServletRequest request, String key) {
        Exception exception = (Exception) request.getSession().getAttribute(key);
        String error = "";
        if (exception instanceof BadCredentialsException) {
            error = "Invalid username and password!";
        } else if (exception instanceof LockedException) {
            error = exception.getMessage();
        } else {
            error = "Invalid username and password!";
        }
        return error;
    }

}
