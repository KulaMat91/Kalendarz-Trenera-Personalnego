package com.example.kalendarz_trenera_personalnego.model;

import com.example.kalendarz_trenera_personalnego.dto.EventDto;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
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
    private Date addDate;  // aby wpisywało date private LocalDateTime created = LocalDateTime.now();

    @Column(name = "event_date")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")  //TODO przesyłanie z godziną?
    private LocalDateTime eventDate;

    @Column(name = "number_of_slots")
    private Integer numberOfSlots;

    @Column(name = "picture",columnDefinition = "MEDIUMTEXT")
    private String picture;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "eventModelList")
    private List<UserModel> userList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventModel")
    private List<OpinionModel> opinionModelList = new ArrayList<>();

    public EventModel(EventDto eventDto) throws IOException {
        this.addDate = new Date();
        this.title = eventDto.getTitle();
        this.description = eventDto.getDescription();
        this.picture = Base64.getEncoder().encodeToString(eventDto.getPicture().getBytes());
        this.numberOfSlots = eventDto.getNumberOfSlots();
        this.eventDate = eventDto.getEventDate();
    }
    public void setEventModel(EventDto eventDto) throws IOException {
        this.title = eventDto.getTitle();
        this.description = eventDto.getDescription();
        this.picture = Base64.getEncoder().encodeToString(eventDto.getPicture().getBytes());
        this.numberOfSlots = eventDto.getNumberOfSlots();
        this.eventDate = eventDto.getEventDate();
    }






}
