package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Permission;

public interface IPermissionRepository extends JpaRepository<Permission, Integer>{
    
}
