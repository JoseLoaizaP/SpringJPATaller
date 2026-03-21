package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Notification;

@Repository
public interface INotificationRepository extends JpaRepository<Notification, Integer>{
    
}
