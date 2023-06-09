package com.example.kalendarz_trenera_personalnego.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "role_model")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RoleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name = "USER";

    @OneToMany( mappedBy = "roleModel")
    List<UserModel> userModelList;




}
