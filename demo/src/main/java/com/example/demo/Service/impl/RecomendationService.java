package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.IRecomendationRepository;
import com.example.demo.Service.IRecomendationService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RecomendationService implements IRecomendationService{
    private final IRecomendationRepository recomendationRepository;
}
