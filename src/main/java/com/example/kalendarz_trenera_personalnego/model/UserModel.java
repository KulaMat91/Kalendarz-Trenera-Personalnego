package com.example.kalendarz_trenera_personalnego.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

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

    @Email
    @Column(name = "email")
    private String email;

    @Column (name = "phone_number")
    private String phoneNumber;

    @ManyToOne
    private EventModel eventModel;




}
