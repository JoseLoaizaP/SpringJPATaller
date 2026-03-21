package com.example.demo.domain;

import java.security.Timestamp;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserProgress {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Timestamp date;
    @Column(name = "effort_level")
    private String effortLevel;
    private String notes;
    @Column(name = "past_weight")
    private Integer pastWeight;
    @Column(name = "current_weight")
    private Integer currentWeight;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
