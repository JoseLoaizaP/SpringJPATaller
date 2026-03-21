package com.example.demo.Service.impl;

import java.sql.Timestamp; // ✅ corregido
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ISesionRepository;
import com.example.demo.Service.ISesionService;
import com.example.demo.domain.Sesion;

@Service
public class SesionService implements ISesionService {

    @Autowired
    private ISesionRepository sesionRepository;

    @Override
    public Sesion save(Sesion sesion) {
        return sesionRepository.save(sesion);
    }

    @Override
    public List<Sesion> findAll() {
        return sesionRepository.findAll();
    }

    @Override
    public Optional<Sesion> findById(Integer id) {
        return sesionRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        sesionRepository.deleteById(id);
    }

    @Override
    public List<Sesion> findByDate(Timestamp date) {
        return sesionRepository.findByDate(date);
    }

    @Override
    public List<Sesion> findByDateGreaterThan(Timestamp date) {
        return sesionRepository.findByDateGreaterThan(date);
    }

    @Override
    public List<Sesion> findByDurationLessThan(Long duration) {
        return sesionRepository.findByDurationLessThan(duration);
    }
}