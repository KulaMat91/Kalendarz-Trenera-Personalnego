package com.example.kalendarz_trenera_personalnego.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;

@Entity(name = "event_model")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EventModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "add_date")
    private Date addDate;

    @Column(name = "event_date")
    private Date eventDate;

    @Column(name = "number_of_slots")
    private Integer numberOfSlots;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventModel")
    private List<UserModel> userList = new ArrayList<>();


}
