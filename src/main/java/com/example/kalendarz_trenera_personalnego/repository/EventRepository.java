package com.example.kalendarz_trenera_personalnego.repository;

import com.example.kalendarz_trenera_personalnego.model.EventModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<EventModel,Long> {

    List<EventModel> findAllByAddDateOrderByAddDateDesc();
}