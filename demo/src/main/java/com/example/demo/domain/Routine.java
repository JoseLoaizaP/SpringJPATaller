package com.example.demo.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Routine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "routine_name")
    private String routineName;
    private String description;
    private String visibility;

    @OneToMany(mappedBy = "routine")
    @JsonIgnore
    private List<ExercisesInRoutine> exercisesInRoutine;

    @ManyToOne
    @JoinColumn(name="sesion_id")
    private Sesion sesion;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name="trainer_id")
    private Trainer trainer;

}
