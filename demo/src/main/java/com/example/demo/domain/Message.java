package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Message{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String content;

    @ManyToOne
    @JoinColumn(name = "sender_user_id", nullable = false)
    private User sender;

    @ManyToOne
    @JoinColumn(name = "receiver_user_id", nullable = false)
    private User reciever;

    @OneToOne
    @JoinColumn(name = "notification")
    private Notification notification;
    
}
