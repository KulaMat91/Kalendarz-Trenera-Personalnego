package com.example.kalendarz_trenera_personalnego.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Getter
@AllArgsConstructor
public class EventDto {


    private String title;

    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date eventDate;

    private Integer numberOfSlots;

    private MultipartFile picture;
}
