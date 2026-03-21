package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.IPermissionRepository;
import com.example.demo.Service.IPermissionService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PermissionService implements IPermissionService {
    private final IPermissionRepository permissionRepository;
}
