package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.ISesionRepository;
import com.example.demo.Service.ISesionService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SesionService implements ISesionService{
    private final ISesionRepository sesionRepository;
}
