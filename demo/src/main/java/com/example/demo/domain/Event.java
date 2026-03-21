package com.example.demo.domain;

import java.security.Timestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Event {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String place;
    private Timestamp date;

    @ManyToOne
    @JoinColumn(name = "admin_id",nullable = false)
    private User admin;

    @OneToMany(mappedBy = "userParticipation")
    private List<UserParticipation> userParticipations;

}
