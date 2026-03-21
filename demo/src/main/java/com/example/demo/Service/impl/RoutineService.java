package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.IRoutineRepository;
import com.example.demo.Service.IRoutineService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RoutineService implements IRoutineService{
    private final IRoutineRepository routineRepository;
}
