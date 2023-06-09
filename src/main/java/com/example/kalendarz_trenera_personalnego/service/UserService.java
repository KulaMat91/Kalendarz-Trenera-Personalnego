package com.example.kalendarz_trenera_personalnego.service;

import com.example.kalendarz_trenera_personalnego.controller.AuthController;
import com.example.kalendarz_trenera_personalnego.controller.UserController;
import com.example.kalendarz_trenera_personalnego.model.UserModel;
import com.example.kalendarz_trenera_personalnego.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;

    public void addUser(UserModel userModel) {
        repo.save(userModel);
    }

    public List<UserModel> getUserList() {
        return repo.findAll();
    }


    public UserModel findUserById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void removeUser(Long id) {
        repo.deleteById(id);
    }

    public void saveEditUser(UserModel editUserModel) {
        repo.save(editUserModel);
    }


}
