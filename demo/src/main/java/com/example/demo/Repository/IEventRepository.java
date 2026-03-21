package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Event;

@Repository
public interface IEventRepository extends JpaRepository<Event, Integer>{
    
}
