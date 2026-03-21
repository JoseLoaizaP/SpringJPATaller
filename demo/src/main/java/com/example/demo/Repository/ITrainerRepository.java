package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Trainer;

public interface ITrainerRepository extends JpaRepository<Trainer, Integer>{
    
}
