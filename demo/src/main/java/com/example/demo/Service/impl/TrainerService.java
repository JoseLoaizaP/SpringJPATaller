package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.ITrainerRepository;
import com.example.demo.Service.ITrainerService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TrainerService implements ITrainerService{
    private final ITrainerRepository trainerRepository;
}
