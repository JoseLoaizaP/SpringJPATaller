package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByFullNameContaining(String fullName);
    List<Student> findByTrainer_Id(Integer trainerId);
    List<Student> findByWeightGreaterThan(Double weight);
    List<Student> findByBirthDate(String birthDate);
}