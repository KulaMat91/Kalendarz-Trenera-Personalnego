package com.example.kalendarz_trenera_personalnego.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "opinion_model")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OpinionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "add_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date addDate;

    @Column(name = "rating")
    private int rating;

    @ManyToOne
    @JoinColumn(name = "user_model_id")
    private UserModel userModel;

    @ManyToOne
    @JoinColumn(name = "event_model_id")
    private EventModel eventModel;
}
