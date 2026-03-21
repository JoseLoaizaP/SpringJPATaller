package com.example.demo.Repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Sesion;

@Repository
public interface ISesionRepository extends JpaRepository<Sesion, Integer>{
    
    List<Sesion> findByDate(Timestamp date);
    List<Sesion> findByDateGreaterThan(Timestamp date);
    List<Sesion> findByDurationLessThan(Long duration);
}

