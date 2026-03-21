package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.Exercise;

public interface IExerciceService {
    List<Exercise> findAll();
    Optional<Exercise> findById(Integer id);
    Exercise save (Exercise exercise);
    void delete (Integer id);
}
