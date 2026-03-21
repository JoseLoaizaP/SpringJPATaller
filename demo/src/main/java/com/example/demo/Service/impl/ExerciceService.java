package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.IExerciceRepository;
import com.example.demo.Service.IExerciceService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ExerciceService implements IExerciceService{
    private final IExerciceRepository exerciceRepository;
}
