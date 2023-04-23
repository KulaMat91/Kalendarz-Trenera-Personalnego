package com.example.kalendarz_trenera_personalnego.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PersonalDataModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name")
    private String name;

    @Column (name = "surname")
    private String surname;

    @Column (name = "phone_number")
    private String phoneNumber;

    @Column (name = "gender")
    private String gender;

    @Column (name = "birthday_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private DateFormat birthdayDate;

    @OneToOne
    private UserModel userModel;
}
