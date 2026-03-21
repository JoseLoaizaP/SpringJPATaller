package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "birth_date")
    private String birthDate;

    private Double weight;
    private Double height;
    private String password;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<UserPermission> userPermissions;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<UserRecomendation> userRecomendations;

    @OneToOne
    @JoinColumn(name = "progress_id")
    private UserProgress progress;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Stats> stats;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Sesion> sesions;

    @OneToMany(mappedBy = "reciever")
    @JsonIgnore
    private List<Message> recievedMessages;

    @OneToMany(mappedBy = "sender")
    @JsonIgnore
    private List<Message> sentMessages;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Notification> notifications;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<UserParticipation> userParticipations;
}