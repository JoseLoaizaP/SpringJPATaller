package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Admin;

public interface IAdminRepository extends JpaRepository<Admin, Integer>{
    
}
