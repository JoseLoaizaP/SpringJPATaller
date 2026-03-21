package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Recomendation;

public interface IRecomendationRepository extends JpaRepository<Recomendation, Integer>{
    
}
