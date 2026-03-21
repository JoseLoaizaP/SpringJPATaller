package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Stats;

public interface IStatsRepository extends JpaRepository<Stats, Integer>{
    
}
