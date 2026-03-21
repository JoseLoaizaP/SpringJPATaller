package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.IAdminRepository;
import com.example.demo.Service.IAdminService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AdminService implements IAdminService{
    private final IAdminRepository adminRepository;
}
