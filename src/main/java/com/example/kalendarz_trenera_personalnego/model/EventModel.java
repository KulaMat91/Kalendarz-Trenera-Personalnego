package com.example.kalendarz_trenera_personalnego.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date addDate;

    @Column(name = "event_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date eventDate;

    @Column(name = "number_of_slots")
    private Integer numberOfSlots;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "eventModelList")
    private List<UserModel> userList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventModel")
    private List<OpinionModel> opinionModelList = new ArrayList<>();


}
