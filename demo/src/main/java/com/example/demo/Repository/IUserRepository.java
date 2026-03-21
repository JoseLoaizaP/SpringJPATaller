package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByFullName(String fullName);
    List<User> findByFullNameContaining(String fullName);
}