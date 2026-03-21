package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.User;

public interface IUserRepository extends JpaRepository<User, Integer>{
    
}
