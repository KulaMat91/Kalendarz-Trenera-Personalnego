package com.example.kalendarz_trenera_personalnego.service;

import com.example.kalendarz_trenera_personalnego.model.UserModel;
import com.example.kalendarz_trenera_personalnego.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
