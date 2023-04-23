//package com.example.kalendarz_trenera_personalnego.service;
//
//import com.example.kalendarz_trenera_personalnego.model.EventModel;
//import com.example.kalendarz_trenera_personalnego.repository.EventRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class EventService {
//
//    private final EventRepository repo;
//
//
//    public List<EventModel> getEventListOrderByAddDate() {
//        return repo.findAllByAddDateOrderByAddDateDesc();
//    }
//
//    public void addEvent(EventModel eventModel) {
//        repo.save(eventModel);
//    }
//
//    public EventModel getEventById(Long id) {
//        return repo.findById(id).orElse(null);
//    }
//
//    public void saveEditEvent(EventModel eventModel) {
//        repo.save(eventModel);
//    }
//
//    public void removeEvent(Long id) {
//        repo.deleteById(id);
//    }
//}
