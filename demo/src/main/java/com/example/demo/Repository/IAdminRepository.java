package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Integer>{
    
}
