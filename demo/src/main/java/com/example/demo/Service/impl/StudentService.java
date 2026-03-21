package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.IStudentRepository;
import com.example.demo.Service.IStudentService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StudentService implements IStudentService {
    private final IStudentRepository studentRepository;
}
