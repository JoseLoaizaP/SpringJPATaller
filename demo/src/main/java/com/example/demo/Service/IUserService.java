package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.User;

public interface IUserService {
    User save(User user);
    List<User> findAll();
    Optional<User> findById(Integer id);
    void delete(Integer id);
    Optional<User> findByFullName(String fullName);
    List<User> findByFullNameContaining(String fullName);
}