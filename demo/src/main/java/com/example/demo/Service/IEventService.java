package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.Event;

public interface IEventService {
    List<Event> findAll();
    Optional<Event> findById(Integer id);
    Event save (Event event);
    void delete (Integer id);
}
