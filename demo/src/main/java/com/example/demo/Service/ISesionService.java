package com.example.demo.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.sql.Timestamp;

import com.example.demo.domain.Sesion;

public interface ISesionService {

    Sesion save(Sesion sesion);
    List<Sesion> findAll();
    Optional<Sesion> findById(Integer id);
    void delete(Integer id);

    List<Sesion> findByDate(Timestamp date);
    List<Sesion> findByDateGreaterThan(Timestamp date);
    List<Sesion> findByDurationLessThan(Long duration);
}