package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.IStatsRepository;
import com.example.demo.Service.IStatsService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StatsService implements IStatsService{
    private final IStatsRepository statsRepository;
}
