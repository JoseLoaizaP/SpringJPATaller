package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer>{
    
}
