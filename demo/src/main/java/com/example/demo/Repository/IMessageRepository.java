package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Message;

public interface IMessageRepository extends JpaRepository<Message, Integer>{
    
}
