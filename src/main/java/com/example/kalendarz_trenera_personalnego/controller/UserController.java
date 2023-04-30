package com.example.kalendarz_trenera_personalnego.controller;

import com.example.kalendarz_trenera_personalnego.model.UserModel;
import com.example.kalendarz_trenera_personalnego.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public  String getUserList(Model model){
        List<UserModel> userModelList = userService.getUserList();
        model.addAttribute("userModel", userModelList);
        return "user/users";

    }

//    @GetMapping("/register")
//    public String getAddUser(){
//        return "auth/register";
//    }

    @PostMapping("/register")
    public RedirectView postAddUser(UserModel userModel){
        userService.addUser(userModel);
        return new RedirectView("/");
    }

    @GetMapping("/editUser/{id}")
    public String getEditUser(@PathVariable("id")Long id, Model model){
        UserModel userModel = userService.findUserById(id);
        model.addAttribute("userModel",userModel);
        return "auth/editUser";
        //TODO Stworzyc strone
    }
    @PostMapping("/editUser/{id}")
    public RedirectView postEditUser(@PathVariable("id")UserModel editUserModel){
        userService.saveEditUser(editUserModel);
        return new RedirectView("home/index");
    }

    @PostMapping("/removeUser/{id}")
    public RedirectView removeUser(@PathVariable("id") Long id){
        userService.removeUser(id);
        return new RedirectView("home/index");
    }






}
