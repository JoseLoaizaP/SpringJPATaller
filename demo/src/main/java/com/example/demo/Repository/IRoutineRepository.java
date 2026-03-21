package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Routine;

public interface IRoutineRepository extends JpaRepository<Routine, Integer>{
    
}
