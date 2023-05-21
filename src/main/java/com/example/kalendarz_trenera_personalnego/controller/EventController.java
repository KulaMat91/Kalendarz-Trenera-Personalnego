package com.example.kalendarz_trenera_personalnego.controller;

import com.example.kalendarz_trenera_personalnego.dto.EventDto;
import com.example.kalendarz_trenera_personalnego.model.EventModel;
import com.example.kalendarz_trenera_personalnego.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;

    @GetMapping("/eventsList")
    public String getEventList(Model model) {
        List<EventModel> eventModelList = eventService.getEventListOrderByAddDate();
        model.addAttribute("eventModel", eventModelList);
//        model.addAttribute("picture", Base64.getEncoder().encodeToString(eventModelList.get(0).getPicture()));
        return "events/eventsList";
    }

    @GetMapping("/addEvent")
    public String getAddEvent() {
        return "/events/addNewEvent";
    }

    @PostMapping("/addEvent")
    public RedirectView postAddEvent(EventDto eventDto) throws IOException {
        EventModel eventModel = new EventModel(eventDto);
        eventService.addEvent(eventModel);
        return new RedirectView("/eventsList");
    }
//    @PostMapping("/singUp/{id}")
//    public RedirectView postSingUpToEvent(@PathVariable("id") Long id, Model model){
//        eventService.
//    }


    @GetMapping("/editEvent/{id}")
    public String getEditEvent(@PathVariable("id") Long id, Model model) {
        EventModel eventModel = eventService.getEventById(id);
        model.addAttribute("eventModel", eventModel);
        return "events/editEvent";
    }

    @PostMapping("/editEvent/{id}")
    public RedirectView postEditEvent(@PathVariable("id") Long id, EventDto eventDto) throws IOException {
        EventModel eventModel = eventService.getEventById(id);
        eventModel.setEventModel(eventDto);
        eventService.saveEditEvent(eventModel);
        return new RedirectView("/eventsList");
    }

    @PostMapping("/deleteEvent/{id}")
    public RedirectView removeEvent(@PathVariable("id") Long id) {
        eventService.removeEvent(id);
        return new RedirectView("/eventsList");
    }

    @GetMapping("/deleteEvent/{id}")
    public String getRemoveEvent(@PathVariable("id") Long id, Model model) {
        EventModel eventModel = eventService.getEventById(id);
        model.addAttribute("eventModel", eventModel);
        return "events/deleteEvent";
    }

}
