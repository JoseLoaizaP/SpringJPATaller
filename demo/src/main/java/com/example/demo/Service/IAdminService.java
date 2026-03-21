package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.Admin;

public interface IAdminService {
    List<Admin> findAll();
    Optional<Admin> findById(Integer id);
    Admin save (Admin admin);
    void delete (Integer id);
}
