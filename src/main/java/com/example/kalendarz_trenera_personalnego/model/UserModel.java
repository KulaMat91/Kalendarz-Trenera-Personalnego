package com.example.kalendarz_trenera_personalnego.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "user_model")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(8)
    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleModel roleModel;

    @ManyToMany
    @JoinTable(
            name = "user_event",
            joinColumns = {@JoinColumn(name = "user_model_id")},
            inverseJoinColumns = {@JoinColumn(name = "event_model_id")}
    )
    private List<EventModel> eventModelList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userModel")
    private List<OpinionModel> opinionModelList = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL) // mappedBy = "userModel" ?
    private PersonalDataModel personalDataModel;


}
