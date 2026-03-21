package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Routine;

@Repository
public interface IRoutineRepository extends JpaRepository<Routine, Integer>{
    
}
