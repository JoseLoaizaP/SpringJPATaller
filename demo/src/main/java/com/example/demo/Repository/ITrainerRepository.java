package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Trainer;

@Repository
public interface ITrainerRepository extends JpaRepository<Trainer, Integer> {

    List<Trainer> findByFullNameContaining(String fullName);
    List<Trainer> findByWeightGreaterThan(Double weight);
    List<Trainer> findByHeightGreaterThan(Double height);
    List<Trainer> findByBirthDate(String birthDate);
}