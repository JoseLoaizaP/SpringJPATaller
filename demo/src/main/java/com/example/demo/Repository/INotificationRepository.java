package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Notification;

public interface INotificationRepository extends JpaRepository<Notification, Integer>{
    
}
