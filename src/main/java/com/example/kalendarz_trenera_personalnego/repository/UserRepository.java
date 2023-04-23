package com.example.kalendarz_trenera_personalnego.repository;

import com.example.kalendarz_trenera_personalnego.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {


}
