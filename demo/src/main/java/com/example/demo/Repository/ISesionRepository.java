package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Sesion;

public interface ISesionRepository extends JpaRepository<Sesion, Integer>{
    
}
