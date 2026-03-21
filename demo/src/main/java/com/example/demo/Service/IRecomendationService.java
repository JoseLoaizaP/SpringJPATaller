package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.Recomendation;

public interface IRecomendationService {

    Recomendation save(Recomendation validRecomendation);

    List<Recomendation> findAll();

    Optional<Recomendation> findById(Integer id);

    void delete(Integer id);

    List<Recomendation> findByDescriptionContaining(String string);
    
}
