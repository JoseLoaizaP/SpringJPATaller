package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Event;

public interface IEventRepository extends JpaRepository<Event, Integer>{
    
}
