package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer>{
    
}
