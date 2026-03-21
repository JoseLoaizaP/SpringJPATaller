package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.IPermissionRepository;
import com.example.demo.Service.IPermissionService;
import lombok.RequiredArgsConstructor;
import com.example.demo.domain.Permission;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PermissionService implements IPermissionService {
    private final IPermissionRepository permissionRepository;

    public Permission save(Permission permission){
        return permissionRepository.save(permission);
    }
    public List<Permission> findAll(){
        return permissionRepository.findAll();
    }
    public Optional<Permission> findById(Integer id){
        return permissionRepository.findById(id);
    }
    public void deleteById(Integer id){
        permissionRepository.deleteById(id);
    }
}
